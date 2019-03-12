package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AddressCommerce extends js.Object {
  val INs: js.Any
  val addressNs: Anon_City
  val commerceNs: Anon_ColorDec
  val companyNs: Anon_Bs
  val databaseNs: Anon_Collation
  val dateNs: Anon_Between
  val financeNs: Anon_Account
  val hackerNs: Anon_Abbreviation
  val helpersNs: Anon_ArgsArray
  val imageNs: Anon_Abstract
  val internetNs: Anon_Avatar
  val loremNs: Anon_LineCount
  val nameNs: Anon_FindName
  val phoneNs: Anon_Format
  val randomNs: Anon_AlphaNumeric
  val systemNs: Anon_CommonFileExt
  def fake(str: java.lang.String): java.lang.String
  def getLocale(): adoneLib.adoneNs.fakeNs.INs.Locale
  def seed(value: scala.Double): scala.Unit
  def setLocale(locale: adoneLib.adoneNs.fakeNs.INs.Locale): scala.Unit
}

object Anon_AddressCommerce {
  @scala.inline
  def apply(
    INs: js.Any,
    addressNs: Anon_City,
    commerceNs: Anon_ColorDec,
    companyNs: Anon_Bs,
    databaseNs: Anon_Collation,
    dateNs: Anon_Between,
    fake: java.lang.String => java.lang.String,
    financeNs: Anon_Account,
    getLocale: () => adoneLib.adoneNs.fakeNs.INs.Locale,
    hackerNs: Anon_Abbreviation,
    helpersNs: Anon_ArgsArray,
    imageNs: Anon_Abstract,
    internetNs: Anon_Avatar,
    loremNs: Anon_LineCount,
    nameNs: Anon_FindName,
    phoneNs: Anon_Format,
    randomNs: Anon_AlphaNumeric,
    seed: scala.Double => scala.Unit,
    setLocale: adoneLib.adoneNs.fakeNs.INs.Locale => scala.Unit,
    systemNs: Anon_CommonFileExt
  ): Anon_AddressCommerce = {
    val __obj = js.Dynamic.literal(INs = INs, addressNs = addressNs, commerceNs = commerceNs, companyNs = companyNs, databaseNs = databaseNs, dateNs = dateNs, fake = js.Any.fromFunction1(fake), financeNs = financeNs, getLocale = js.Any.fromFunction0(getLocale), hackerNs = hackerNs, helpersNs = helpersNs, imageNs = imageNs, internetNs = internetNs, loremNs = loremNs, nameNs = nameNs, phoneNs = phoneNs, randomNs = randomNs, seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), systemNs = systemNs)
  
    __obj.asInstanceOf[Anon_AddressCommerce]
  }
}

