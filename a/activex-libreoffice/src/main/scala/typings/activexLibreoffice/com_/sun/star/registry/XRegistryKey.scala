package typings.activexLibreoffice.com_.sun.star.registry

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes structural information (except regarding tree structures) of a single registry key accessible.
  *
  * This is the main interface for registry keys.
  * @see XSimpleRegistry
  */
@js.native
trait XRegistryKey extends XInterface {
  /**
    * @returns a sequence of ascii strings if the key contains an ascii list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii list.
    */
  var AsciiListValue: SafeArray[String] = js.native
  /**
    * @returns an ascii string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii.
    */
  var AsciiValue: String = js.native
  /**
    * @returns a binary value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type binary.
    */
  var BinaryValue: SafeArray[Double] = js.native
  /**
    * This is the key of the entry relative to its parent.
    *
    * The access path starts with the root "/" and all parent entry names are delimited with slashes "/" too, like in a UNIX (R) file system. Slashes which
    * are part of single names are represented as hexadecimals preceded with a "%" like in URL syntax.
    */
  var KeyName: String = js.native
  /**
    * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
    * @throws InvalidRegistryException if the registry is not open.
    */
  val KeyNames: SafeArray[String] = js.native
  /**
    * @returns a sequence of longs if the key contains a long list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type long list.
    */
  var LongListValue: SafeArray[Double] = js.native
  /**
    * @returns a long value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the value is not of type long.
    */
  var LongValue: Double = js.native
  /**
    * @returns a sequence of unicode strings if the key contains an unicode string list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string list.
    */
  var StringListValue: SafeArray[String] = js.native
  /**
    * @returns a unicode string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string.
    */
  var StringValue: String = js.native
  /**
    * @returns the type of the key value or NOT_DEFINED if the key has no value.
    * @throws InvalidRegistryException if the registry is not open.
    */
  val ValueType: RegistryValueType = js.native
  /**
    * closes a key in the registry.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def closeKey(): Unit = js.native
  /**
    * creates a new key in the registry.
    *
    * If the key already exists, the function will open the key.
    * @param aKeyName specifies the relative path from the current key to the key which will be created.
    * @returns a NULL interface if the key could not be created.
    * @throws InvalidRegistryException if the registry is not open, the registry is readonly or if the key exists and is of type LINK.
    */
  def createKey(aKeyName: String): XRegistryKey = js.native
  /**
    * creates a new link in the registry.
    * @param aLinkName specifies the relative path from the current key to the link which will be created.
    * @param aLinkTarget specifies the full path of the key which will be referenced by the link.
    * @returns `TRUE` if the link was created. If the link already exists or the link target does not exist, the function returns `FALSE` .
    * @throws InvalidRegistryException if the registry is not open or the registry is readonly.
    */
  def createLink(aLinkName: String, aLinkTarget: String): Boolean = js.native
  /**
    * deletes a key from the registry.
    * @param rKeyName specifies the relative path from the current key to the key which will be deleted.
    * @throws InvalidRegistryException if the registry is not open, the registry is readonly, the key does not exists or if the key is of type LINK.
    */
  def deleteKey(rKeyName: String): Unit = js.native
  /**
    * deletes a link from the registry.
    * @param rLinkName specifies the relative path from the current key to the link which will be deleted.
    * @throws InvalidRegistryException if the registry is not open, the registry is readonly, or if the link does not exist.
    */
  def deleteLink(rLinkName: String): Unit = js.native
  /**
    * @returns a sequence of ascii strings if the key contains an ascii list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii list.
    */
  def getAsciiListValue(): SafeArray[String] = js.native
  /**
    * @returns an ascii string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type ascii.
    */
  def getAsciiValue(): String = js.native
  /**
    * @returns a binary value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type binary.
    */
  def getBinaryValue(): SafeArray[Double] = js.native
  /**
    * @returns a sequence with the names of all subkeys of the key. If the key has no subkeys, the function returns an empty sequence. If a subkey is a link, th
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getKeyNames(): SafeArray[String] = js.native
  /**
    * @param rKeyName specifies the relative path from the current key to the key of the type which will be returned.
    * @returns the type of the specified key.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getKeyType(rKeyName: String): RegistryKeyType = js.native
  /**
    * @param rLinkName specifies the relative path from the current key to the link which target will be returned.
    * @returns the target (complete path of a key) of the link specified by rLinkName.
    * @throws InvalidRegistryException if the registry is not open or the link does not exists.
    */
  def getLinkTarget(rLinkName: String): String = js.native
  /**
    * @returns a sequence of longs if the key contains a long list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type long list.
    */
  def getLongListValue(): SafeArray[Double] = js.native
  /**
    * @returns a long value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the value is not of type long.
    */
  def getLongValue(): Double = js.native
  /**
    * @param aKeyName specifies a relative path from the current key which will be resolved from all links.
    * @returns the resolved name of a key. The function resolve the complete name of the key. If a link could not be resolved, the linktarget concatenated with
    * @throws InvalidRegistryException if the registry is not open or a recursion was detected.
    */
  def getResolvedName(aKeyName: String): String = js.native
  /**
    * @returns a sequence of unicode strings if the key contains an unicode string list value.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string list.
    */
  def getStringListValue(): SafeArray[String] = js.native
  /**
    * @returns a unicode string value if the key contains one.
    * @throws InvalidRegistryException if the registry is not open.
    * @throws InvalidValueException if the actual value is not of type string.
    */
  def getStringValue(): String = js.native
  /**
    * @returns the type of the key value or NOT_DEFINED if the key has no value.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def getValueType(): RegistryValueType = js.native
  /**
    * checks if the key can be overwritten.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def isReadOnly(): Boolean = js.native
  /** checks if the key points to an open valid key in the data-source. */
  def isValid(): Boolean = js.native
  /**
    * opens a sub key of the key.
    *
    * If the sub key does not exist, the function returns a NULL-interface.
    * @param aKeyName the relative path from the current key to the key which will be created.
    * @returns a NULL interface if the key does not exist.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def openKey(aKeyName: String): XRegistryKey = js.native
  /**
    * opens all subkeys of the key. If a subkey is a link, the link will be resolved and the appropriate key will be opened.
    * @returns an empty sequence if the key has no subkeys.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def openKeys(): SafeArray[XRegistryKey] = js.native
  /**
    * sets an ASCII string list value to the key.
    *
    * The high byte of the string should be NULL. If not, there is no guarantee that the string will be correctly transported. If the key already has a
    * value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setAsciiListValue(seqValue: SeqEquiv[String]): Unit = js.native
  /**
    * sets an ASCII string value to the key.
    *
    * The high byte of the string should be NULL. If not, there is no guarantee that the string will be correctly transported. If the key already has a
    * value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setAsciiValue(value: String): Unit = js.native
  /**
    * sets a binary value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setBinaryValue(value: SeqEquiv[Double]): Unit = js.native
  /**
    * sets a long list value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setLongListValue(seqValue: SeqEquiv[Double]): Unit = js.native
  /**
    * sets a long value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setLongValue(value: Double): Unit = js.native
  /**
    * sets a unicode string value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setStringListValue(seqValue: SeqEquiv[String]): Unit = js.native
  /**
    * sets a unicode string value to the key.
    *
    * If the key already has a value, the value will be overridden.
    * @throws InvalidRegistryException if the registry is not open.
    */
  def setStringValue(value: String): Unit = js.native
}

object XRegistryKey {
  @scala.inline
  def apply(
    AsciiListValue: SafeArray[String],
    AsciiValue: String,
    BinaryValue: SafeArray[Double],
    KeyName: String,
    KeyNames: SafeArray[String],
    LongListValue: SafeArray[Double],
    LongValue: Double,
    StringListValue: SafeArray[String],
    StringValue: String,
    ValueType: RegistryValueType,
    acquire: () => Unit,
    closeKey: () => Unit,
    createKey: String => XRegistryKey,
    createLink: (String, String) => Boolean,
    deleteKey: String => Unit,
    deleteLink: String => Unit,
    getAsciiListValue: () => SafeArray[String],
    getAsciiValue: () => String,
    getBinaryValue: () => SafeArray[Double],
    getKeyNames: () => SafeArray[String],
    getKeyType: String => RegistryKeyType,
    getLinkTarget: String => String,
    getLongListValue: () => SafeArray[Double],
    getLongValue: () => Double,
    getResolvedName: String => String,
    getStringListValue: () => SafeArray[String],
    getStringValue: () => String,
    getValueType: () => RegistryValueType,
    isReadOnly: () => Boolean,
    isValid: () => Boolean,
    openKey: String => XRegistryKey,
    openKeys: () => SafeArray[XRegistryKey],
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setAsciiListValue: SeqEquiv[String] => Unit,
    setAsciiValue: String => Unit,
    setBinaryValue: SeqEquiv[Double] => Unit,
    setLongListValue: SeqEquiv[Double] => Unit,
    setLongValue: Double => Unit,
    setStringListValue: SeqEquiv[String] => Unit,
    setStringValue: String => Unit
  ): XRegistryKey = {
    val __obj = js.Dynamic.literal(AsciiListValue = AsciiListValue.asInstanceOf[js.Any], AsciiValue = AsciiValue.asInstanceOf[js.Any], BinaryValue = BinaryValue.asInstanceOf[js.Any], KeyName = KeyName.asInstanceOf[js.Any], KeyNames = KeyNames.asInstanceOf[js.Any], LongListValue = LongListValue.asInstanceOf[js.Any], LongValue = LongValue.asInstanceOf[js.Any], StringListValue = StringListValue.asInstanceOf[js.Any], StringValue = StringValue.asInstanceOf[js.Any], ValueType = ValueType.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), closeKey = js.Any.fromFunction0(closeKey), createKey = js.Any.fromFunction1(createKey), createLink = js.Any.fromFunction2(createLink), deleteKey = js.Any.fromFunction1(deleteKey), deleteLink = js.Any.fromFunction1(deleteLink), getAsciiListValue = js.Any.fromFunction0(getAsciiListValue), getAsciiValue = js.Any.fromFunction0(getAsciiValue), getBinaryValue = js.Any.fromFunction0(getBinaryValue), getKeyNames = js.Any.fromFunction0(getKeyNames), getKeyType = js.Any.fromFunction1(getKeyType), getLinkTarget = js.Any.fromFunction1(getLinkTarget), getLongListValue = js.Any.fromFunction0(getLongListValue), getLongValue = js.Any.fromFunction0(getLongValue), getResolvedName = js.Any.fromFunction1(getResolvedName), getStringListValue = js.Any.fromFunction0(getStringListValue), getStringValue = js.Any.fromFunction0(getStringValue), getValueType = js.Any.fromFunction0(getValueType), isReadOnly = js.Any.fromFunction0(isReadOnly), isValid = js.Any.fromFunction0(isValid), openKey = js.Any.fromFunction1(openKey), openKeys = js.Any.fromFunction0(openKeys), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setAsciiListValue = js.Any.fromFunction1(setAsciiListValue), setAsciiValue = js.Any.fromFunction1(setAsciiValue), setBinaryValue = js.Any.fromFunction1(setBinaryValue), setLongListValue = js.Any.fromFunction1(setLongListValue), setLongValue = js.Any.fromFunction1(setLongValue), setStringListValue = js.Any.fromFunction1(setStringListValue), setStringValue = js.Any.fromFunction1(setStringValue))
    __obj.asInstanceOf[XRegistryKey]
  }
  @scala.inline
  implicit class XRegistryKeyOps[Self <: XRegistryKey] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAsciiListValue(value: SafeArray[String]): Self = this.set("AsciiListValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setAsciiValue(value: String): Self = this.set("AsciiValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setBinaryValue(value: SafeArray[Double]): Self = this.set("BinaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("KeyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyNames(value: SafeArray[String]): Self = this.set("KeyNames", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongListValue(value: SafeArray[Double]): Self = this.set("LongListValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongValue(value: Double): Self = this.set("LongValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringListValue(value: SafeArray[String]): Self = this.set("StringListValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringValue(value: String): Self = this.set("StringValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueType(value: RegistryValueType): Self = this.set("ValueType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloseKey(value: () => Unit): Self = this.set("closeKey", js.Any.fromFunction0(value))
    @scala.inline
    def setCreateKey(value: String => XRegistryKey): Self = this.set("createKey", js.Any.fromFunction1(value))
    @scala.inline
    def setCreateLink(value: (String, String) => Boolean): Self = this.set("createLink", js.Any.fromFunction2(value))
    @scala.inline
    def setDeleteKey(value: String => Unit): Self = this.set("deleteKey", js.Any.fromFunction1(value))
    @scala.inline
    def setDeleteLink(value: String => Unit): Self = this.set("deleteLink", js.Any.fromFunction1(value))
    @scala.inline
    def setGetAsciiListValue(value: () => SafeArray[String]): Self = this.set("getAsciiListValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetAsciiValue(value: () => String): Self = this.set("getAsciiValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBinaryValue(value: () => SafeArray[Double]): Self = this.set("getBinaryValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKeyNames(value: () => SafeArray[String]): Self = this.set("getKeyNames", js.Any.fromFunction0(value))
    @scala.inline
    def setGetKeyType(value: String => RegistryKeyType): Self = this.set("getKeyType", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLinkTarget(value: String => String): Self = this.set("getLinkTarget", js.Any.fromFunction1(value))
    @scala.inline
    def setGetLongListValue(value: () => SafeArray[Double]): Self = this.set("getLongListValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLongValue(value: () => Double): Self = this.set("getLongValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetResolvedName(value: String => String): Self = this.set("getResolvedName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetStringListValue(value: () => SafeArray[String]): Self = this.set("getStringListValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetStringValue(value: () => String): Self = this.set("getStringValue", js.Any.fromFunction0(value))
    @scala.inline
    def setGetValueType(value: () => RegistryValueType): Self = this.set("getValueType", js.Any.fromFunction0(value))
    @scala.inline
    def setIsReadOnly(value: () => Boolean): Self = this.set("isReadOnly", js.Any.fromFunction0(value))
    @scala.inline
    def setIsValid(value: () => Boolean): Self = this.set("isValid", js.Any.fromFunction0(value))
    @scala.inline
    def setOpenKey(value: String => XRegistryKey): Self = this.set("openKey", js.Any.fromFunction1(value))
    @scala.inline
    def setOpenKeys(value: () => SafeArray[XRegistryKey]): Self = this.set("openKeys", js.Any.fromFunction0(value))
    @scala.inline
    def setSetAsciiListValue(value: SeqEquiv[String] => Unit): Self = this.set("setAsciiListValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetAsciiValue(value: String => Unit): Self = this.set("setAsciiValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetBinaryValue(value: SeqEquiv[Double] => Unit): Self = this.set("setBinaryValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLongListValue(value: SeqEquiv[Double] => Unit): Self = this.set("setLongListValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetLongValue(value: Double => Unit): Self = this.set("setLongValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStringListValue(value: SeqEquiv[String] => Unit): Self = this.set("setStringListValue", js.Any.fromFunction1(value))
    @scala.inline
    def setSetStringValue(value: String => Unit): Self = this.set("setStringValue", js.Any.fromFunction1(value))
  }
  
}

