package typings.awsDashSdk

import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRoute53domainsMod {
  type AddressLine = java.lang.String
  type BillingRecords = js.Array[BillingRecord]
  type Boolean = scala.Boolean
  type City = java.lang.String
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ContactName = java.lang.String
  type ContactNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PERSON
    - typings.awsDashSdk.awsDashSdkStrings.COMPANY
    - typings.awsDashSdk.awsDashSdkStrings.ASSOCIATION
    - typings.awsDashSdk.awsDashSdkStrings.PUBLIC_BODY
    - typings.awsDashSdk.awsDashSdkStrings.RESELLER
    - java.lang.String
  */
  type ContactType = _ContactType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AD
    - typings.awsDashSdk.awsDashSdkStrings.AE
    - typings.awsDashSdk.awsDashSdkStrings.AF
    - typings.awsDashSdk.awsDashSdkStrings.AG
    - typings.awsDashSdk.awsDashSdkStrings.AI
    - typings.awsDashSdk.awsDashSdkStrings.AL
    - typings.awsDashSdk.awsDashSdkStrings.AM
    - typings.awsDashSdk.awsDashSdkStrings.AN
    - typings.awsDashSdk.awsDashSdkStrings.AO
    - typings.awsDashSdk.awsDashSdkStrings.AQ
    - typings.awsDashSdk.awsDashSdkStrings.AR
    - typings.awsDashSdk.awsDashSdkStrings.AS
    - typings.awsDashSdk.awsDashSdkStrings.AT
    - typings.awsDashSdk.awsDashSdkStrings.AU
    - typings.awsDashSdk.awsDashSdkStrings.AW
    - typings.awsDashSdk.awsDashSdkStrings.AZ
    - typings.awsDashSdk.awsDashSdkStrings.BA
    - typings.awsDashSdk.awsDashSdkStrings.BB
    - typings.awsDashSdk.awsDashSdkStrings.BD
    - typings.awsDashSdk.awsDashSdkStrings.BE
    - typings.awsDashSdk.awsDashSdkStrings.BF
    - typings.awsDashSdk.awsDashSdkStrings.BG
    - typings.awsDashSdk.awsDashSdkStrings.BH
    - typings.awsDashSdk.awsDashSdkStrings.BI
    - typings.awsDashSdk.awsDashSdkStrings.BJ
    - typings.awsDashSdk.awsDashSdkStrings.BL
    - typings.awsDashSdk.awsDashSdkStrings.BM
    - typings.awsDashSdk.awsDashSdkStrings.BN
    - typings.awsDashSdk.awsDashSdkStrings.BO
    - typings.awsDashSdk.awsDashSdkStrings.BR
    - typings.awsDashSdk.awsDashSdkStrings.BS
    - typings.awsDashSdk.awsDashSdkStrings.BT
    - typings.awsDashSdk.awsDashSdkStrings.BW
    - typings.awsDashSdk.awsDashSdkStrings.BY
    - typings.awsDashSdk.awsDashSdkStrings.BZ
    - typings.awsDashSdk.awsDashSdkStrings.CA
    - typings.awsDashSdk.awsDashSdkStrings.CC
    - typings.awsDashSdk.awsDashSdkStrings.CD
    - typings.awsDashSdk.awsDashSdkStrings.CF
    - typings.awsDashSdk.awsDashSdkStrings.CG
    - typings.awsDashSdk.awsDashSdkStrings.CH
    - typings.awsDashSdk.awsDashSdkStrings.CI
    - typings.awsDashSdk.awsDashSdkStrings.CK
    - typings.awsDashSdk.awsDashSdkStrings.CL
    - typings.awsDashSdk.awsDashSdkStrings.CM
    - typings.awsDashSdk.awsDashSdkStrings.CN
    - typings.awsDashSdk.awsDashSdkStrings.CO
    - typings.awsDashSdk.awsDashSdkStrings.CR
    - typings.awsDashSdk.awsDashSdkStrings.CU
    - typings.awsDashSdk.awsDashSdkStrings.CV
    - typings.awsDashSdk.awsDashSdkStrings.CX
    - typings.awsDashSdk.awsDashSdkStrings.CY
    - typings.awsDashSdk.awsDashSdkStrings.CZ
    - typings.awsDashSdk.awsDashSdkStrings.DE
    - typings.awsDashSdk.awsDashSdkStrings.DJ
    - typings.awsDashSdk.awsDashSdkStrings.DK
    - typings.awsDashSdk.awsDashSdkStrings.DM
    - typings.awsDashSdk.awsDashSdkStrings.DO
    - typings.awsDashSdk.awsDashSdkStrings.DZ
    - typings.awsDashSdk.awsDashSdkStrings.EC
    - typings.awsDashSdk.awsDashSdkStrings.EE
    - typings.awsDashSdk.awsDashSdkStrings.EG
    - typings.awsDashSdk.awsDashSdkStrings.ER
    - typings.awsDashSdk.awsDashSdkStrings.ES
    - typings.awsDashSdk.awsDashSdkStrings.ET
    - typings.awsDashSdk.awsDashSdkStrings.FI
    - typings.awsDashSdk.awsDashSdkStrings.FJ
    - typings.awsDashSdk.awsDashSdkStrings.FK
    - typings.awsDashSdk.awsDashSdkStrings.FM
    - typings.awsDashSdk.awsDashSdkStrings.FO
    - typings.awsDashSdk.awsDashSdkStrings.FR
    - typings.awsDashSdk.awsDashSdkStrings.GA
    - typings.awsDashSdk.awsDashSdkStrings.GB
    - typings.awsDashSdk.awsDashSdkStrings.GD
    - typings.awsDashSdk.awsDashSdkStrings.GE
    - typings.awsDashSdk.awsDashSdkStrings.GH
    - typings.awsDashSdk.awsDashSdkStrings.GI
    - typings.awsDashSdk.awsDashSdkStrings.GL
    - typings.awsDashSdk.awsDashSdkStrings.GM
    - typings.awsDashSdk.awsDashSdkStrings.GN
    - typings.awsDashSdk.awsDashSdkStrings.GQ
    - typings.awsDashSdk.awsDashSdkStrings.GR
    - typings.awsDashSdk.awsDashSdkStrings.GT
    - typings.awsDashSdk.awsDashSdkStrings.GU
    - typings.awsDashSdk.awsDashSdkStrings.GW
    - typings.awsDashSdk.awsDashSdkStrings.GY
    - typings.awsDashSdk.awsDashSdkStrings.HK
    - typings.awsDashSdk.awsDashSdkStrings.HN
    - typings.awsDashSdk.awsDashSdkStrings.HR
    - typings.awsDashSdk.awsDashSdkStrings.HT
    - typings.awsDashSdk.awsDashSdkStrings.HU
    - typings.awsDashSdk.awsDashSdkStrings.ID
    - typings.awsDashSdk.awsDashSdkStrings.IE
    - typings.awsDashSdk.awsDashSdkStrings.IL
    - typings.awsDashSdk.awsDashSdkStrings.IM
    - typings.awsDashSdk.awsDashSdkStrings.IN
    - typings.awsDashSdk.awsDashSdkStrings.IQ
    - typings.awsDashSdk.awsDashSdkStrings.IR
    - typings.awsDashSdk.awsDashSdkStrings.IS
    - typings.awsDashSdk.awsDashSdkStrings.IT
    - typings.awsDashSdk.awsDashSdkStrings.JM
    - typings.awsDashSdk.awsDashSdkStrings.JO
    - typings.awsDashSdk.awsDashSdkStrings.JP
    - typings.awsDashSdk.awsDashSdkStrings.KE
    - typings.awsDashSdk.awsDashSdkStrings.KG
    - typings.awsDashSdk.awsDashSdkStrings.KH
    - typings.awsDashSdk.awsDashSdkStrings.KI
    - typings.awsDashSdk.awsDashSdkStrings.KM
    - typings.awsDashSdk.awsDashSdkStrings.KN
    - typings.awsDashSdk.awsDashSdkStrings.KP
    - typings.awsDashSdk.awsDashSdkStrings.KR
    - typings.awsDashSdk.awsDashSdkStrings.KW
    - typings.awsDashSdk.awsDashSdkStrings.KY
    - typings.awsDashSdk.awsDashSdkStrings.KZ
    - typings.awsDashSdk.awsDashSdkStrings.LA
    - typings.awsDashSdk.awsDashSdkStrings.LB
    - typings.awsDashSdk.awsDashSdkStrings.LC
    - typings.awsDashSdk.awsDashSdkStrings.LI
    - typings.awsDashSdk.awsDashSdkStrings.LK
    - typings.awsDashSdk.awsDashSdkStrings.LR
    - typings.awsDashSdk.awsDashSdkStrings.LS
    - typings.awsDashSdk.awsDashSdkStrings.LT
    - typings.awsDashSdk.awsDashSdkStrings.LU
    - typings.awsDashSdk.awsDashSdkStrings.LV
    - typings.awsDashSdk.awsDashSdkStrings.LY
    - typings.awsDashSdk.awsDashSdkStrings.MA
    - typings.awsDashSdk.awsDashSdkStrings.MC
    - typings.awsDashSdk.awsDashSdkStrings.MD
    - typings.awsDashSdk.awsDashSdkStrings.ME
    - typings.awsDashSdk.awsDashSdkStrings.MF
    - typings.awsDashSdk.awsDashSdkStrings.MG
    - typings.awsDashSdk.awsDashSdkStrings.MH
    - typings.awsDashSdk.awsDashSdkStrings.MK
    - typings.awsDashSdk.awsDashSdkStrings.ML
    - typings.awsDashSdk.awsDashSdkStrings.MM
    - typings.awsDashSdk.awsDashSdkStrings.MN
    - typings.awsDashSdk.awsDashSdkStrings.MO
    - typings.awsDashSdk.awsDashSdkStrings.MP
    - typings.awsDashSdk.awsDashSdkStrings.MR
    - typings.awsDashSdk.awsDashSdkStrings.MS
    - typings.awsDashSdk.awsDashSdkStrings.MT
    - typings.awsDashSdk.awsDashSdkStrings.MU
    - typings.awsDashSdk.awsDashSdkStrings.MV
    - typings.awsDashSdk.awsDashSdkStrings.MW
    - typings.awsDashSdk.awsDashSdkStrings.MX
    - typings.awsDashSdk.awsDashSdkStrings.MY
    - typings.awsDashSdk.awsDashSdkStrings.MZ
    - typings.awsDashSdk.awsDashSdkStrings.NA
    - typings.awsDashSdk.awsDashSdkStrings.NC
    - typings.awsDashSdk.awsDashSdkStrings.NE
    - typings.awsDashSdk.awsDashSdkStrings.NG
    - typings.awsDashSdk.awsDashSdkStrings.NI
    - typings.awsDashSdk.awsDashSdkStrings.NL
    - typings.awsDashSdk.awsDashSdkStrings.NO
    - typings.awsDashSdk.awsDashSdkStrings.NP
    - typings.awsDashSdk.awsDashSdkStrings.NR
    - typings.awsDashSdk.awsDashSdkStrings.NU
    - typings.awsDashSdk.awsDashSdkStrings.NZ
    - typings.awsDashSdk.awsDashSdkStrings.OM
    - typings.awsDashSdk.awsDashSdkStrings.PA
    - typings.awsDashSdk.awsDashSdkStrings.PE
    - typings.awsDashSdk.awsDashSdkStrings.PF
    - typings.awsDashSdk.awsDashSdkStrings.PG
    - typings.awsDashSdk.awsDashSdkStrings.PH
    - typings.awsDashSdk.awsDashSdkStrings.PK
    - typings.awsDashSdk.awsDashSdkStrings.PL
    - typings.awsDashSdk.awsDashSdkStrings.PM
    - typings.awsDashSdk.awsDashSdkStrings.PN
    - typings.awsDashSdk.awsDashSdkStrings.PR
    - typings.awsDashSdk.awsDashSdkStrings.PT
    - typings.awsDashSdk.awsDashSdkStrings.PW
    - typings.awsDashSdk.awsDashSdkStrings.PY
    - typings.awsDashSdk.awsDashSdkStrings.QA
    - typings.awsDashSdk.awsDashSdkStrings.RO
    - typings.awsDashSdk.awsDashSdkStrings.RS
    - typings.awsDashSdk.awsDashSdkStrings.RU
    - typings.awsDashSdk.awsDashSdkStrings.RW
    - typings.awsDashSdk.awsDashSdkStrings.SA
    - typings.awsDashSdk.awsDashSdkStrings.SB
    - typings.awsDashSdk.awsDashSdkStrings.SC
    - typings.awsDashSdk.awsDashSdkStrings.SD
    - typings.awsDashSdk.awsDashSdkStrings.SE
    - typings.awsDashSdk.awsDashSdkStrings.SG
    - typings.awsDashSdk.awsDashSdkStrings.SH
    - typings.awsDashSdk.awsDashSdkStrings.SI
    - typings.awsDashSdk.awsDashSdkStrings.SK
    - typings.awsDashSdk.awsDashSdkStrings.SL
    - typings.awsDashSdk.awsDashSdkStrings.SM
    - typings.awsDashSdk.awsDashSdkStrings.SN
    - typings.awsDashSdk.awsDashSdkStrings.SO
    - typings.awsDashSdk.awsDashSdkStrings.SR
    - typings.awsDashSdk.awsDashSdkStrings.ST
    - typings.awsDashSdk.awsDashSdkStrings.SV
    - typings.awsDashSdk.awsDashSdkStrings.SY
    - typings.awsDashSdk.awsDashSdkStrings.SZ
    - typings.awsDashSdk.awsDashSdkStrings.TC
    - typings.awsDashSdk.awsDashSdkStrings.TD
    - typings.awsDashSdk.awsDashSdkStrings.TG
    - typings.awsDashSdk.awsDashSdkStrings.TH
    - typings.awsDashSdk.awsDashSdkStrings.TJ
    - typings.awsDashSdk.awsDashSdkStrings.TK
    - typings.awsDashSdk.awsDashSdkStrings.TL
    - typings.awsDashSdk.awsDashSdkStrings.TM
    - typings.awsDashSdk.awsDashSdkStrings.TN
    - typings.awsDashSdk.awsDashSdkStrings.TO
    - typings.awsDashSdk.awsDashSdkStrings.TR
    - typings.awsDashSdk.awsDashSdkStrings.TT
    - typings.awsDashSdk.awsDashSdkStrings.TV
    - typings.awsDashSdk.awsDashSdkStrings.TW
    - typings.awsDashSdk.awsDashSdkStrings.TZ
    - typings.awsDashSdk.awsDashSdkStrings.UA
    - typings.awsDashSdk.awsDashSdkStrings.UG
    - typings.awsDashSdk.awsDashSdkStrings.US
    - typings.awsDashSdk.awsDashSdkStrings.UY
    - typings.awsDashSdk.awsDashSdkStrings.UZ
    - typings.awsDashSdk.awsDashSdkStrings.VA
    - typings.awsDashSdk.awsDashSdkStrings.VC
    - typings.awsDashSdk.awsDashSdkStrings.VE
    - typings.awsDashSdk.awsDashSdkStrings.VG
    - typings.awsDashSdk.awsDashSdkStrings.VI
    - typings.awsDashSdk.awsDashSdkStrings.VN
    - typings.awsDashSdk.awsDashSdkStrings.VU
    - typings.awsDashSdk.awsDashSdkStrings.WF
    - typings.awsDashSdk.awsDashSdkStrings.WS
    - typings.awsDashSdk.awsDashSdkStrings.YE
    - typings.awsDashSdk.awsDashSdkStrings.YT
    - typings.awsDashSdk.awsDashSdkStrings.ZA
    - typings.awsDashSdk.awsDashSdkStrings.ZM
    - typings.awsDashSdk.awsDashSdkStrings.ZW
    - java.lang.String
  */
  type CountryCode = _CountryCode | java.lang.String
  type CurrentExpiryYear = Double
  type DNSSec = java.lang.String
  type DomainAuthCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE_RESERVED
    - typings.awsDashSdk.awsDashSdkStrings.AVAILABLE_PREORDER
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE_PREMIUM
    - typings.awsDashSdk.awsDashSdkStrings.UNAVAILABLE_RESTRICTED
    - typings.awsDashSdk.awsDashSdkStrings.RESERVED
    - typings.awsDashSdk.awsDashSdkStrings.DONT_KNOW
    - java.lang.String
  */
  type DomainAvailability = _DomainAvailability | java.lang.String
  type DomainName = java.lang.String
  type DomainStatus = java.lang.String
  type DomainStatusList = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList = js.Array[DomainSummary]
  type DurationInYears = Double
  type Email = java.lang.String
  type ErrorMessage = java.lang.String
  type ExtraParamList = js.Array[ExtraParam]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.DUNS_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.BRAND_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.BIRTH_DEPARTMENT
    - typings.awsDashSdk.awsDashSdkStrings.BIRTH_DATE_IN_YYYY_MM_DD
    - typings.awsDashSdk.awsDashSdkStrings.BIRTH_COUNTRY
    - typings.awsDashSdk.awsDashSdkStrings.BIRTH_CITY
    - typings.awsDashSdk.awsDashSdkStrings.DOCUMENT_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.AU_ID_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.AU_ID_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.CA_LEGAL_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.CA_BUSINESS_ENTITY_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.ES_IDENTIFICATION
    - typings.awsDashSdk.awsDashSdkStrings.ES_IDENTIFICATION_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.ES_LEGAL_FORM
    - typings.awsDashSdk.awsDashSdkStrings.FI_BUSINESS_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.FI_ID_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.FI_NATIONALITY
    - typings.awsDashSdk.awsDashSdkStrings.FI_ORGANIZATION_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.IT_PIN
    - typings.awsDashSdk.awsDashSdkStrings.IT_REGISTRANT_ENTITY_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.RU_PASSPORT_DATA
    - typings.awsDashSdk.awsDashSdkStrings.SE_ID_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.SG_ID_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.VAT_NUMBER
    - typings.awsDashSdk.awsDashSdkStrings.UK_CONTACT_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.UK_COMPANY_NUMBER
    - java.lang.String
  */
  type ExtraParamName = _ExtraParamName | java.lang.String
  type ExtraParamValue = java.lang.String
  type FIAuthKey = java.lang.String
  type GlueIp = java.lang.String
  type GlueIpList = js.Array[GlueIp]
  type HostName = java.lang.String
  type Integer = Double
  type InvoiceId = java.lang.String
  type LangCode = java.lang.String
  type NameserverList = js.Array[Nameserver]
  type OperationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUBMITTED
    - typings.awsDashSdk.awsDashSdkStrings.IN_PROGRESS
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESSFUL
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.REGISTER_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.DELETE_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.TRANSFER_IN_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_DOMAIN_CONTACT
    - typings.awsDashSdk.awsDashSdkStrings.UPDATE_NAMESERVER
    - typings.awsDashSdk.awsDashSdkStrings.CHANGE_PRIVACY_PROTECTION
    - typings.awsDashSdk.awsDashSdkStrings.DOMAIN_LOCK
    - typings.awsDashSdk.awsDashSdkStrings.ENABLE_AUTORENEW
    - typings.awsDashSdk.awsDashSdkStrings.DISABLE_AUTORENEW
    - typings.awsDashSdk.awsDashSdkStrings.ADD_DNSSEC
    - typings.awsDashSdk.awsDashSdkStrings.REMOVE_DNSSEC
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRE_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.TRANSFER_OUT_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.CHANGE_DOMAIN_OWNER
    - typings.awsDashSdk.awsDashSdkStrings.RENEW_DOMAIN
    - typings.awsDashSdk.awsDashSdkStrings.PUSH_DOMAIN
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = Double
  type Price = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.PENDING
    - typings.awsDashSdk.awsDashSdkStrings.DONE
    - typings.awsDashSdk.awsDashSdkStrings.EXPIRED
    - java.lang.String
  */
  type ReachabilityStatus = _ReachabilityStatus | java.lang.String
  type RegistrarName = java.lang.String
  type RegistrarUrl = java.lang.String
  type RegistrarWhoIsServer = java.lang.String
  type RegistryDomainId = java.lang.String
  type Reseller = java.lang.String
  type State = java.lang.String
  type String = java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TRANSFERABLE
    - typings.awsDashSdk.awsDashSdkStrings.UNTRANSFERABLE
    - typings.awsDashSdk.awsDashSdkStrings.DONT_KNOW
    - java.lang.String
  */
  type Transferable = _Transferable | java.lang.String
  type ZipCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2014-05-15`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
