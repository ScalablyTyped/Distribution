package typings.applepayjs.ApplePayJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Names of the fields in the shipping or billing contact information, used to locate errors in the payment sheet.
  */
/* Rewritten from type alias, can be one of: 
  - typings.applepayjs.applepayjsStrings.phoneNumber
  - typings.applepayjs.applepayjsStrings.emailAddress
  - typings.applepayjs.applepayjsStrings.name
  - typings.applepayjs.applepayjsStrings.phoneticName
  - typings.applepayjs.applepayjsStrings.postalAddress
  - typings.applepayjs.applepayjsStrings.addressLines
  - typings.applepayjs.applepayjsStrings.locality
  - typings.applepayjs.applepayjsStrings.subLocality
  - typings.applepayjs.applepayjsStrings.postalCode
  - typings.applepayjs.applepayjsStrings.administrativeArea
  - typings.applepayjs.applepayjsStrings.subAdministrativeArea
  - typings.applepayjs.applepayjsStrings.country
  - typings.applepayjs.applepayjsStrings.countryCode
*/
trait ApplePayErrorContactField extends js.Object

object ApplePayErrorContactField {
  @scala.inline
  def addressLines: typings.applepayjs.applepayjsStrings.addressLines = this.cast("addressLines")
  @scala.inline
  def administrativeArea: typings.applepayjs.applepayjsStrings.administrativeArea = this.cast("administrativeArea")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def country: typings.applepayjs.applepayjsStrings.country = this.cast("country")
  @scala.inline
  def countryCode: typings.applepayjs.applepayjsStrings.countryCode = this.cast("countryCode")
  @scala.inline
  def emailAddress: typings.applepayjs.applepayjsStrings.emailAddress = this.cast("emailAddress")
  @scala.inline
  def locality: typings.applepayjs.applepayjsStrings.locality = this.cast("locality")
  @scala.inline
  def name: typings.applepayjs.applepayjsStrings.name = this.cast("name")
  @scala.inline
  def phoneNumber: typings.applepayjs.applepayjsStrings.phoneNumber = this.cast("phoneNumber")
  @scala.inline
  def phoneticName: typings.applepayjs.applepayjsStrings.phoneticName = this.cast("phoneticName")
  @scala.inline
  def postalAddress: typings.applepayjs.applepayjsStrings.postalAddress = this.cast("postalAddress")
  @scala.inline
  def postalCode: typings.applepayjs.applepayjsStrings.postalCode = this.cast("postalCode")
  @scala.inline
  def subAdministrativeArea: typings.applepayjs.applepayjsStrings.subAdministrativeArea = this.cast("subAdministrativeArea")
  @scala.inline
  def subLocality: typings.applepayjs.applepayjsStrings.subLocality = this.cast("subLocality")
}

