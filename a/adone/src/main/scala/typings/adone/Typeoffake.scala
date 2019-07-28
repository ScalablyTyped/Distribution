package typings.adone

import typings.adone.adoneNs.fakeNs.INs.Locale
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
  def fake(str: String): String
  def getLocale(): Locale
  def seed(value: Double): Unit
  def setLocale(locale: Locale): Unit
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
    fake: String => String,
    financeNs: Typeoffinance,
    getLocale: () => Locale,
    hackerNs: Typeofhacker,
    helpersNs: Typeofhelpers,
    imageNs: Typeofimage,
    internetNs: Typeofinternet,
    loremNs: Typeoflorem,
    nameNs: Typeofname,
    phoneNs: Typeofphone,
    randomNs: Typeofrandom,
    seed: Double => Unit,
    setLocale: Locale => Unit,
    systemNs: Typeofsystem
  ): Typeoffake = {
    val __obj = js.Dynamic.literal(INs = INs, addressNs = addressNs, commerceNs = commerceNs, companyNs = companyNs, databaseNs = databaseNs, dateNs = dateNs, fake = js.Any.fromFunction1(fake), financeNs = financeNs, getLocale = js.Any.fromFunction0(getLocale), hackerNs = hackerNs, helpersNs = helpersNs, imageNs = imageNs, internetNs = internetNs, loremNs = loremNs, nameNs = nameNs, phoneNs = phoneNs, randomNs = randomNs, seed = js.Any.fromFunction1(seed), setLocale = js.Any.fromFunction1(setLocale), systemNs = systemNs)
  
    __obj.asInstanceOf[Typeoffake]
  }
}

