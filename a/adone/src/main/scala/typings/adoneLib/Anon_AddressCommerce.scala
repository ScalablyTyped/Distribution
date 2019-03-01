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
    fake: js.Function1[java.lang.String, java.lang.String],
    financeNs: Anon_Account,
    getLocale: js.Function0[adoneLib.adoneNs.fakeNs.INs.Locale],
    hackerNs: Anon_Abbreviation,
    helpersNs: Anon_ArgsArray,
    imageNs: Anon_Abstract,
    internetNs: Anon_Avatar,
    loremNs: Anon_LineCount,
    nameNs: Anon_FindName,
    phoneNs: Anon_Format,
    randomNs: Anon_AlphaNumeric,
    seed: js.Function1[scala.Double, scala.Unit],
    setLocale: js.Function1[adoneLib.adoneNs.fakeNs.INs.Locale, scala.Unit],
    systemNs: Anon_CommonFileExt
  ): Anon_AddressCommerce = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("INs")(INs)
    __obj.updateDynamic("addressNs")(addressNs)
    __obj.updateDynamic("commerceNs")(commerceNs)
    __obj.updateDynamic("companyNs")(companyNs)
    __obj.updateDynamic("databaseNs")(databaseNs)
    __obj.updateDynamic("dateNs")(dateNs)
    __obj.updateDynamic("fake")(fake)
    __obj.updateDynamic("financeNs")(financeNs)
    __obj.updateDynamic("getLocale")(getLocale)
    __obj.updateDynamic("hackerNs")(hackerNs)
    __obj.updateDynamic("helpersNs")(helpersNs)
    __obj.updateDynamic("imageNs")(imageNs)
    __obj.updateDynamic("internetNs")(internetNs)
    __obj.updateDynamic("loremNs")(loremNs)
    __obj.updateDynamic("nameNs")(nameNs)
    __obj.updateDynamic("phoneNs")(phoneNs)
    __obj.updateDynamic("randomNs")(randomNs)
    __obj.updateDynamic("seed")(seed)
    __obj.updateDynamic("setLocale")(setLocale)
    __obj.updateDynamic("systemNs")(systemNs)
    __obj.asInstanceOf[Anon_AddressCommerce]
  }
}

