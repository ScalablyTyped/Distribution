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
  var AsciiListValue: activexDashInteropLib.SafeArray[java.lang.String]
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
  var BinaryValue: activexDashInteropLib.SafeArray[scala.Double]
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
  val KeyNames: activexDashInteropLib.SafeArray[java.lang.String]
  /**
    * @returns a sequence of longs if the key contains a long list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type long list.
    */
  var LongListValue: activexDashInteropLib.SafeArray[scala.Double]
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
  var StringListValue: activexDashInteropLib.SafeArray[java.lang.String]
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
  def getAsciiListValue(): activexDashInteropLib.SafeArray[java.lang.String]
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
  def getBinaryValue(): activexDashInteropLib.SafeArray[scala.Double]
  /**
    * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getKeyNames(): activexDashInteropLib.SafeArray[java.lang.String]
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
  def getLongListValue(): activexDashInteropLib.SafeArray[scala.Double]
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
  def getStringListValue(): activexDashInteropLib.SafeArray[java.lang.String]
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
  def openKeys(): activexDashInteropLib.SafeArray[XRegistryKey]
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
    AsciiListValue: activexDashInteropLib.SafeArray[java.lang.String],
    AsciiValue: java.lang.String,
    BinaryValue: activexDashInteropLib.SafeArray[scala.Double],
    KeyName: java.lang.String,
    KeyNames: activexDashInteropLib.SafeArray[java.lang.String],
    LongListValue: activexDashInteropLib.SafeArray[scala.Double],
    LongValue: scala.Double,
    StringListValue: activexDashInteropLib.SafeArray[java.lang.String],
    StringValue: java.lang.String,
    ValueType: RegistryValueType,
    acquire: js.Function0[scala.Unit],
    closeKey: js.Function0[scala.Unit],
    createKey: js.Function1[java.lang.String, XRegistryKey],
    createLink: js.Function2[java.lang.String, java.lang.String, scala.Boolean],
    deleteKey: js.Function1[java.lang.String, scala.Unit],
    deleteLink: js.Function1[java.lang.String, scala.Unit],
    getAsciiListValue: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getAsciiValue: js.Function0[java.lang.String],
    getBinaryValue: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getKeyNames: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getKeyType: js.Function1[java.lang.String, RegistryKeyType],
    getLinkTarget: js.Function1[java.lang.String, java.lang.String],
    getLongListValue: js.Function0[activexDashInteropLib.SafeArray[scala.Double]],
    getLongValue: js.Function0[scala.Double],
    getResolvedName: js.Function1[java.lang.String, java.lang.String],
    getStringListValue: js.Function0[activexDashInteropLib.SafeArray[java.lang.String]],
    getStringValue: js.Function0[java.lang.String],
    getValueType: js.Function0[RegistryValueType],
    isReadOnly: js.Function0[scala.Boolean],
    isValid: js.Function0[scala.Boolean],
    openKey: js.Function1[java.lang.String, XRegistryKey],
    openKeys: js.Function0[activexDashInteropLib.SafeArray[XRegistryKey]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setAsciiListValue: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setAsciiValue: js.Function1[java.lang.String, scala.Unit],
    setBinaryValue: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    setLongListValue: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[scala.Double], scala.Unit],
    setLongValue: js.Function1[scala.Double, scala.Unit],
    setStringListValue: js.Function1[activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[java.lang.String], scala.Unit],
    setStringValue: js.Function1[java.lang.String, scala.Unit]
  ): XRegistryKey = {
    val __obj = js.Dynamic.literal(AsciiListValue = AsciiListValue, AsciiValue = AsciiValue, BinaryValue = BinaryValue, KeyName = KeyName, KeyNames = KeyNames, LongListValue = LongListValue, LongValue = LongValue, StringListValue = StringListValue, StringValue = StringValue, ValueType = ValueType, acquire = acquire, closeKey = closeKey, createKey = createKey, createLink = createLink, deleteKey = deleteKey, deleteLink = deleteLink, getAsciiListValue = getAsciiListValue, getAsciiValue = getAsciiValue, getBinaryValue = getBinaryValue, getKeyNames = getKeyNames, getKeyType = getKeyType, getLinkTarget = getLinkTarget, getLongListValue = getLongListValue, getLongValue = getLongValue, getResolvedName = getResolvedName, getStringListValue = getStringListValue, getStringValue = getStringValue, getValueType = getValueType, isReadOnly = isReadOnly, isValid = isValid, openKey = openKey, openKeys = openKeys, queryInterface = queryInterface, release = release, setAsciiListValue = setAsciiListValue, setAsciiValue = setAsciiValue, setBinaryValue = setBinaryValue, setLongListValue = setLongListValue, setLongValue = setLongValue, setStringListValue = setStringListValue, setStringValue = setStringValue)
  
    __obj.asInstanceOf[XRegistryKey]
  }
}

