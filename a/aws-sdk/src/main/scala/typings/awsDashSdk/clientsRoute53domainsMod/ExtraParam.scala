package typings.awsDashSdk.clientsRoute53domainsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtraParam extends js.Object {
  /**
    * Name of the additional parameter required by the top-level domain. Here are the top-level domains that require additional parameters and which parameters they require:    .com.au and .net.au: AU_ID_NUMBER and AU_ID_TYPE     .ca: BRAND_NUMBER, CA_LEGAL_TYPE, and CA_BUSINESS_ENTITY_TYPE     .es: ES_IDENTIFICATION, ES_IDENTIFICATION_TYPE, and ES_LEGAL_FORM     .fi: BIRTH_DATE_IN_YYYY_MM_DD, FI_BUSINESS_NUMBER, FI_ID_NUMBER, FI_NATIONALITY, and FI_ORGANIZATION_TYPE     .fr: BRAND_NUMBER, BIRTH_DEPARTMENT, BIRTH_DATE_IN_YYYY_MM_DD, BIRTH_COUNTRY, and BIRTH_CITY     .it: BIRTH_COUNTRY, IT_PIN, and IT_REGISTRANT_ENTITY_TYPE     .ru: BIRTH_DATE_IN_YYYY_MM_DD and RU_PASSPORT_DATA     .se: BIRTH_COUNTRY and SE_ID_NUMBER     .sg: SG_ID_NUMBER     .co.uk, .me.uk, and .org.uk: UK_CONTACT_TYPE and UK_COMPANY_NUMBER    In addition, many TLDs require VAT_NUMBER.
    */
  var Name: ExtraParamName
  /**
    * Values corresponding to the additional parameter names required by some top-level domains.
    */
  var Value: ExtraParamValue
}

object ExtraParam {
  @scala.inline
  def apply(Name: ExtraParamName, Value: ExtraParamValue): ExtraParam = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Value = Value)
  
    __obj.asInstanceOf[ExtraParam]
  }
}

