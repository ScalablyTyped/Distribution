package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeoffake extends js.Object {
  val INs: js.Any
  val addressNs: Typeofaddress
  val commerceNs: Typeofcommerce
  val companyNs: Typeofcompany
  val databaseNs: Typeofdatabase
  val dateNs: Typeofdate
  val financeNs: Typeoffinance
  val hackerNs: Typeofhacker
  val helpersNs: Typeofhelpers
  val imageNs: Typeofimage
  val internetNs: Typeofinternet
  val loremNs: Typeoflorem
  val nameNs: Typeofname
  val phoneNs: Typeofphone
  val randomNs: Typeofrandom
  val systemNs: Typeofsystem
  def fake(str: java.lang.String): java.lang.String
  def getLocale(): adoneLib.adoneNs.fakeNs.INs.Locale
  def seed(value: scala.Double): scala.Unit
  def setLocale(locale: adoneLib.adoneNs.fakeNs.INs.Locale): scala.Unit
}

object Typeoffake {
  @scala.inline
  def apply(
    INs: js.Any,
    addressNs: Typeofaddress,
    commerceNs: Typeofcommerce,
    companyNs: Typeofcompany,
    databaseNs: Typeofdatabase,
    dateNs: Typeofdate,
    fake: java.lang.String => java.lang.String,
    financeNs: Typeoffinance,
    getLocale: () => adoneLib.adoneNs.fakeNs.INs.Locale,
    hackerNs: Typeofhacker,
    helpersNs: Typeofhelpers,
    imageNs: Typeofimage,
    internetNs: Typeofinternet,
    loremNs: Typeoflorem,
    nameNs: Typeofname,
    phoneNs: Typeofphone,
    randomNs: Typeofrandom,
    seed: scala.Double => scala.Unit,
    setLocale: adoneLib.adoneNs.fakeNs.INs.Locale => scala.Unit,
    systemNs: Typeofsystem
  ): Typeoffake = {
    val __obj = js.Dynamic.literal(INs = INs, addressNs = addressNs, commerceNs = commerceNs, companyNs = companyNs, databaseNs = databaseNs, dateNs = dateNs, fake = js.Any.fromFunction1(fake), financeNs = financeNs, getLocale = js.Any.fromFunction0(getLocale), hackerNs = hackerNs, helpersNs = helpersNs, imageNs = imageNs, internetNs = internetNs, loremNs = loremNs, nameNs = nameNs, phoneNs = phoneNs, randomNs = randomNs, seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), systemNs = systemNs)
  
    __obj.asInstanceOf[Typeoffake]
  }
}

