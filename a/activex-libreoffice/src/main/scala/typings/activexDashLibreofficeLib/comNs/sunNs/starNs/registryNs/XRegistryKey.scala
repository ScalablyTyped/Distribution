package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.registryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes structural information (except regarding tree structures) of a single registry key accessible.
  *
  * This is the main interface for registry keys.
  * @see XSimpleRegistry
  */
trait XRegistryKey
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns a sequence of ascii strings if the key contains an ascii list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii list.
    */
  var AsciiListValue: stdLib.SafeArray[java.lang.String]
  /**
    * @returns an ascii string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii.
    */
  var AsciiValue: java.lang.String
  /**
    * @returns a binary value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type binary.
    */
  var BinaryValue: stdLib.SafeArray[scala.Double]
  /**
    * This is the key of the entry relative to its parent.
    *
    * The access path starts with the root "/" and all parent entry names are delimited with slashes "/" too, like in a UNIX (R) file system. Slashes which
    * are part of single names are represented as hexadecimals preceded with a "%" like in URL syntax.
    */
  var KeyName: java.lang.String
  /**
    * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
    * @throws InvalidRegistryException if the registry is not open.
    */
  val KeyNames: stdLib.SafeArray[java.lang.String]
  /**
    * @returns a sequence of longs if the key contains a long list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type long list.
    */
  var LongListValue: stdLib.SafeArray[scala.Double]
  /**
    * @returns a long value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the value is not of type long.
    */
  var LongValue: scala.Double
  /**
    * @returns a sequence of unicode strings if the key contains an unicode string list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string list.
    */
  var StringListValue: stdLib.SafeArray[java.lang.String]
  /**
    * @returns a unicode string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string.
    */
  var StringValue: java.lang.String
  /**
    * @returns the type of the key value or NOT_DEFINED if the key has no value.
    * @throws InvalidRegistryException if the registry is not open.
    */
  val ValueType: RegistryValueType
  /**
    * closes a key in the registry.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def closeKey(): scala.Unit
  /**
    * creates a new key in the registry.
    *
    * If the key already exists, the function will open the key.
    * @param aKeyName specifies the relative path from the current key to the key which will be created.
    * @returns a NULL interface if the key could not be created.
    * @throws InvalidRegistryException if the registry is not open, the registry is readonly or if the key exists and is of type LINK.
    */
  def createKey(aKeyName: java.lang.String): XRegistryKey
  /**
    * creates a new link in the registry.
    * @param aLinkName specifies the relative path from the current key to the link which will be created.
    * @param aLinkTarget specifies the full path of the key which will be referenced by the link.
    * @returns `TRUE` if the link was created. If the link already exists or the link target does not exist, the function returns `FALSE` .
    * @throws InvalidRegistryException if the registry is not open or the registry is readonly.
    */
  def createLink(aLinkName: java.lang.String, aLinkTarget: java.lang.String): scala.Boolean
  /**
    * deletes a key from the registry.
    * @param rKeyName specifies the relative path from the current key to the key which will be deleted.
    * @throws InvalidRegistryException if the registry is not open, the registry is readonly, the key does not exists or if the key is of type LINK.
    */
  def deleteKey(rKeyName: java.lang.String): scala.Unit
  /**
    * deletes a link from the registry.
    * @param rLinkName specifies the relative path from the current key to the link which will be deleted.
    * @throws InvalidRegistryException if the registry is not open, the registry is readonly, or if the link does not exist.
    */
  def deleteLink(rLinkName: java.lang.String): scala.Unit
  /**
    * @returns a sequence of ascii strings if the key contains an ascii list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii list.
    */
  def getAsciiListValue(): stdLib.SafeArray[java.lang.String]
  /**
    * @returns an ascii string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii.
    */
  def getAsciiValue(): java.lang.String
  /**
    * @returns a binary value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type binary.
    */
  def getBinaryValue(): stdLib.SafeArray[scala.Double]
  /**
    * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getKeyNames(): stdLib.SafeArray[java.lang.String]
  /**
    * @param rKeyName specifies the relative path from the current key to the key of the type which will be returned.
    * @returns the type of the specified key.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getKeyType(rKeyName: java.lang.String): RegistryKeyType
  /**
    * @param rLinkName specifies the relative path from the current key to the link which target will be returned.
    * @returns the target (complete path of a key) of the link specified by rLinkName.
    * @throws InvalidRegistryException if the registry is not open or the link does not exists.
    */
  def getLinkTarget(rLinkName: java.lang.String): java.lang.String
  /**
    * @returns a sequence of longs if the key contains a long list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type long list.
    */
  def getLongListValue(): stdLib.SafeArray[scala.Double]
  /**
    * @returns a long value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the value is not of type long.
    */
  def getLongValue(): scala.Double
  /**
    * @param aKeyName specifies a relative path from the current key which will be resolved from all links.
    * @returns the resolved name of a key. The function resolve the complete name of the key. If a link could not be resolved, the linktarget concatenated with
    * @throws InvalidRegistryException if the registry is not open or a recursion was detected.
    */
  def getResolvedName(aKeyName: java.lang.String): java.lang.String
  /**
    * @returns a sequence of unicode strings if the key contains an unicode string list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string list.
    */
  def getStringListValue(): stdLib.SafeArray[java.lang.String]
  /**
    * @returns a unicode string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string.
    */
  def getStringValue(): java.lang.String
  /**
    * @returns the type of the key value or NOT_DEFINED if the key has no value.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getValueType(): RegistryValueType
  /**
    * checks if the key can be overwritten.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def isReadOnly(): scala.Boolean
  /** checks if the key points to an open valid key in the data-source. */
  def isValid(): scala.Boolean
  /**
    * opens a sub key of the key.
    *
    * If the sub key does not exist, the function returns a NULL-interface.
    * @param aKeyName the relative path from the current key to the key which will be created.
    * @returns a NULL interface if the key does not exist.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def openKey(aKeyName: java.lang.String): XRegistryKey
  /**
    * opens all subkeys of the key. If a subkey is a link, the link will be resolved and the appropriate key will be opened.
    * @returns an empty sequence if the key has no subkeys.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def openKeys(): stdLib.SafeArray[XRegistryKey]
  /**
    * sets an ASCII string list value to the key.
    *
    * The high byte of the string should be NULL. If not, there is no guarantee that the string will be correctly transported. If the key already has a
    * value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setAsciiListValue(seqValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * sets an ASCII string value to the key.
    *
    * The high byte of the string should be NULL. If not, there is no guarantee that the string will be correctly transported. If the key already has a
    * value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setAsciiValue(value: java.lang.String): scala.Unit
  /**
    * sets a binary value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setBinaryValue(value: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * sets a long list value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setLongListValue(seqValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double]): scala.Unit
  /**
    * sets a long value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setLongValue(value: scala.Double): scala.Unit
  /**
    * sets a unicode string value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setStringListValue(seqValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String]): scala.Unit
  /**
    * sets a unicode string value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setStringValue(value: java.lang.String): scala.Unit
}

object XRegistryKey {
  @scala.inline
  def apply(
    AsciiListValue: stdLib.SafeArray[java.lang.String],
    AsciiValue: java.lang.String,
    BinaryValue: stdLib.SafeArray[scala.Double],
    KeyName: java.lang.String,
    KeyNames: stdLib.SafeArray[java.lang.String],
    LongListValue: stdLib.SafeArray[scala.Double],
    LongValue: scala.Double,
    StringListValue: stdLib.SafeArray[java.lang.String],
    StringValue: java.lang.String,
    ValueType: RegistryValueType,
    acquire: () => scala.Unit,
    closeKey: () => scala.Unit,
    createKey: java.lang.String => XRegistryKey,
    createLink: (java.lang.String, java.lang.String) => scala.Boolean,
    deleteKey: java.lang.String => scala.Unit,
    deleteLink: java.lang.String => scala.Unit,
    getAsciiListValue: () => stdLib.SafeArray[java.lang.String],
    getAsciiValue: () => java.lang.String,
    getBinaryValue: () => stdLib.SafeArray[scala.Double],
    getKeyNames: () => stdLib.SafeArray[java.lang.String],
    getKeyType: java.lang.String => RegistryKeyType,
    getLinkTarget: java.lang.String => java.lang.String,
    getLongListValue: () => stdLib.SafeArray[scala.Double],
    getLongValue: () => scala.Double,
    getResolvedName: java.lang.String => java.lang.String,
    getStringListValue: () => stdLib.SafeArray[java.lang.String],
    getStringValue: () => java.lang.String,
    getValueType: () => RegistryValueType,
    isReadOnly: () => scala.Boolean,
    isValid: () => scala.Boolean,
    openKey: java.lang.String => XRegistryKey,
    openKeys: () => stdLib.SafeArray[XRegistryKey],
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setAsciiListValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setAsciiValue: java.lang.String => scala.Unit,
    setBinaryValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    setLongListValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double] => scala.Unit,
    setLongValue: scala.Double => scala.Unit,
    setStringListValue: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String] => scala.Unit,
    setStringValue: java.lang.String => scala.Unit
  ): XRegistryKey = {
    val __obj = js.Dynamic.literal(AsciiListValue = AsciiListValue, AsciiValue = AsciiValue, BinaryValue = BinaryValue, KeyName = KeyName, KeyNames = KeyNames, LongListValue = LongListValue, LongValue = LongValue, StringListValue = StringListValue, StringValue = StringValue, ValueType = ValueType, acquire = js.Any.fromFunction0(acquire), closeKey = js.Any.fromFunction0(closeKey), createKey = js.Any.fromFunction1(createKey), createLink = js.Any.fromFunction2(createLink), deleteKey = js.Any.fromFunction1(deleteKey), deleteLink = js.Any.fromFunction1(deleteLink), getAsciiListValue = js.Any.fromFunction0(getAsciiListValue), getAsciiValue = js.Any.fromFunction0(getAsciiValue), getBinaryValue = js.Any.fromFunction0(getBinaryValue), getKeyNames = js.Any.fromFunction0(getKeyNames), getKeyType = js.Any.fromFunction1(getKeyType), getLinkTarget = js.Any.fromFunction1(getLinkTarget), getLongListValue = js.Any.fromFunction0(getLongListValue), getLongValue = js.Any.fromFunction0(getLongValue), getResolvedName = js.Any.fromFunction1(getResolvedName), getStringListValue = js.Any.fromFunction0(getStringListValue), getStringValue = js.Any.fromFunction0(getStringValue), getValueType = js.Any.fromFunction0(getValueType), isReadOnly = js.Any.fromFunction0(isReadOnly), isValid = js.Any.fromFunction0(isValid), openKey = js.Any.fromFunction1(openKey), openKeys = js.Any.fromFunction0(openKeys), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAsciiListValue = js.Any.fromFunction1(setAsciiListValue), setAsciiValue = js.Any.fromFunction1(setAsciiValue), setBinaryValue = js.Any.fromFunction1(setBinaryValue), setLongListValue = js.Any.fromFunction1(setLongListValue), setLongValue = js.Any.fromFunction1(setLongValue), setStringListValue = js.Any.fromFunction1(setStringListValue), setStringValue = js.Any.fromFunction1(setStringValue))
  
    __obj.asInstanceOf[XRegistryKey]
  }
}

