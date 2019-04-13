package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsRoute53domainsMod {
  type AddressLine = java.lang.String
  type BillingRecords = js.Array[BillingRecord]
  type Boolean = scala.Boolean
  type City = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ContactName = java.lang.String
  type ContactNumber = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PERSON
    - awsDashSdkLib.awsDashSdkLibStrings.COMPANY
    - awsDashSdkLib.awsDashSdkLibStrings.ASSOCIATION
    - awsDashSdkLib.awsDashSdkLibStrings.PUBLIC_BODY
    - awsDashSdkLib.awsDashSdkLibStrings.RESELLER
    - java.lang.String
  */
  type ContactType = _ContactType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AD
    - awsDashSdkLib.awsDashSdkLibStrings.AE
    - awsDashSdkLib.awsDashSdkLibStrings.AF
    - awsDashSdkLib.awsDashSdkLibStrings.AG
    - awsDashSdkLib.awsDashSdkLibStrings.AI
    - awsDashSdkLib.awsDashSdkLibStrings.AL
    - awsDashSdkLib.awsDashSdkLibStrings.AM
    - awsDashSdkLib.awsDashSdkLibStrings.AN
    - awsDashSdkLib.awsDashSdkLibStrings.AO
    - awsDashSdkLib.awsDashSdkLibStrings.AQ
    - awsDashSdkLib.awsDashSdkLibStrings.AR
    - awsDashSdkLib.awsDashSdkLibStrings.AS
    - awsDashSdkLib.awsDashSdkLibStrings.AT
    - awsDashSdkLib.awsDashSdkLibStrings.AU
    - awsDashSdkLib.awsDashSdkLibStrings.AW
    - awsDashSdkLib.awsDashSdkLibStrings.AZ
    - awsDashSdkLib.awsDashSdkLibStrings.BA
    - awsDashSdkLib.awsDashSdkLibStrings.BB
    - awsDashSdkLib.awsDashSdkLibStrings.BD
    - awsDashSdkLib.awsDashSdkLibStrings.BE
    - awsDashSdkLib.awsDashSdkLibStrings.BF
    - awsDashSdkLib.awsDashSdkLibStrings.BG
    - awsDashSdkLib.awsDashSdkLibStrings.BH
    - awsDashSdkLib.awsDashSdkLibStrings.BI
    - awsDashSdkLib.awsDashSdkLibStrings.BJ
    - awsDashSdkLib.awsDashSdkLibStrings.BL
    - awsDashSdkLib.awsDashSdkLibStrings.BM
    - awsDashSdkLib.awsDashSdkLibStrings.BN
    - awsDashSdkLib.awsDashSdkLibStrings.BO
    - awsDashSdkLib.awsDashSdkLibStrings.BR
    - awsDashSdkLib.awsDashSdkLibStrings.BS
    - awsDashSdkLib.awsDashSdkLibStrings.BT
    - awsDashSdkLib.awsDashSdkLibStrings.BW
    - awsDashSdkLib.awsDashSdkLibStrings.BY
    - awsDashSdkLib.awsDashSdkLibStrings.BZ
    - awsDashSdkLib.awsDashSdkLibStrings.CA
    - awsDashSdkLib.awsDashSdkLibStrings.CC
    - awsDashSdkLib.awsDashSdkLibStrings.CD
    - awsDashSdkLib.awsDashSdkLibStrings.CF
    - awsDashSdkLib.awsDashSdkLibStrings.CG
    - awsDashSdkLib.awsDashSdkLibStrings.CH
    - awsDashSdkLib.awsDashSdkLibStrings.CI
    - awsDashSdkLib.awsDashSdkLibStrings.CK
    - awsDashSdkLib.awsDashSdkLibStrings.CL
    - awsDashSdkLib.awsDashSdkLibStrings.CM
    - awsDashSdkLib.awsDashSdkLibStrings.CN
    - awsDashSdkLib.awsDashSdkLibStrings.CO
    - awsDashSdkLib.awsDashSdkLibStrings.CR
    - awsDashSdkLib.awsDashSdkLibStrings.CU
    - awsDashSdkLib.awsDashSdkLibStrings.CV
    - awsDashSdkLib.awsDashSdkLibStrings.CX
    - awsDashSdkLib.awsDashSdkLibStrings.CY
    - awsDashSdkLib.awsDashSdkLibStrings.CZ
    - awsDashSdkLib.awsDashSdkLibStrings.DE
    - awsDashSdkLib.awsDashSdkLibStrings.DJ
    - awsDashSdkLib.awsDashSdkLibStrings.DK
    - awsDashSdkLib.awsDashSdkLibStrings.DM
    - awsDashSdkLib.awsDashSdkLibStrings.DO
    - awsDashSdkLib.awsDashSdkLibStrings.DZ
    - awsDashSdkLib.awsDashSdkLibStrings.EC
    - awsDashSdkLib.awsDashSdkLibStrings.EE
    - awsDashSdkLib.awsDashSdkLibStrings.EG
    - awsDashSdkLib.awsDashSdkLibStrings.ER
    - awsDashSdkLib.awsDashSdkLibStrings.ES
    - awsDashSdkLib.awsDashSdkLibStrings.ET
    - awsDashSdkLib.awsDashSdkLibStrings.FI
    - awsDashSdkLib.awsDashSdkLibStrings.FJ
    - awsDashSdkLib.awsDashSdkLibStrings.FK
    - awsDashSdkLib.awsDashSdkLibStrings.FM
    - awsDashSdkLib.awsDashSdkLibStrings.FO
    - awsDashSdkLib.awsDashSdkLibStrings.FR
    - awsDashSdkLib.awsDashSdkLibStrings.GA
    - awsDashSdkLib.awsDashSdkLibStrings.GB
    - awsDashSdkLib.awsDashSdkLibStrings.GD
    - awsDashSdkLib.awsDashSdkLibStrings.GE
    - awsDashSdkLib.awsDashSdkLibStrings.GH
    - awsDashSdkLib.awsDashSdkLibStrings.GI
    - awsDashSdkLib.awsDashSdkLibStrings.GL
    - awsDashSdkLib.awsDashSdkLibStrings.GM
    - awsDashSdkLib.awsDashSdkLibStrings.GN
    - awsDashSdkLib.awsDashSdkLibStrings.GQ
    - awsDashSdkLib.awsDashSdkLibStrings.GR
    - awsDashSdkLib.awsDashSdkLibStrings.GT
    - awsDashSdkLib.awsDashSdkLibStrings.GU
    - awsDashSdkLib.awsDashSdkLibStrings.GW
    - awsDashSdkLib.awsDashSdkLibStrings.GY
    - awsDashSdkLib.awsDashSdkLibStrings.HK
    - awsDashSdkLib.awsDashSdkLibStrings.HN
    - awsDashSdkLib.awsDashSdkLibStrings.HR
    - awsDashSdkLib.awsDashSdkLibStrings.HT
    - awsDashSdkLib.awsDashSdkLibStrings.HU
    - awsDashSdkLib.awsDashSdkLibStrings.ID
    - awsDashSdkLib.awsDashSdkLibStrings.IE
    - awsDashSdkLib.awsDashSdkLibStrings.IL
    - awsDashSdkLib.awsDashSdkLibStrings.IM
    - awsDashSdkLib.awsDashSdkLibStrings.IN
    - awsDashSdkLib.awsDashSdkLibStrings.IQ
    - awsDashSdkLib.awsDashSdkLibStrings.IR
    - awsDashSdkLib.awsDashSdkLibStrings.IS
    - awsDashSdkLib.awsDashSdkLibStrings.IT
    - awsDashSdkLib.awsDashSdkLibStrings.JM
    - awsDashSdkLib.awsDashSdkLibStrings.JO
    - awsDashSdkLib.awsDashSdkLibStrings.JP
    - awsDashSdkLib.awsDashSdkLibStrings.KE
    - awsDashSdkLib.awsDashSdkLibStrings.KG
    - awsDashSdkLib.awsDashSdkLibStrings.KH
    - awsDashSdkLib.awsDashSdkLibStrings.KI
    - awsDashSdkLib.awsDashSdkLibStrings.KM
    - awsDashSdkLib.awsDashSdkLibStrings.KN
    - awsDashSdkLib.awsDashSdkLibStrings.KP
    - awsDashSdkLib.awsDashSdkLibStrings.KR
    - awsDashSdkLib.awsDashSdkLibStrings.KW
    - awsDashSdkLib.awsDashSdkLibStrings.KY
    - awsDashSdkLib.awsDashSdkLibStrings.KZ
    - awsDashSdkLib.awsDashSdkLibStrings.LA
    - awsDashSdkLib.awsDashSdkLibStrings.LB
    - awsDashSdkLib.awsDashSdkLibStrings.LC
    - awsDashSdkLib.awsDashSdkLibStrings.LI
    - awsDashSdkLib.awsDashSdkLibStrings.LK
    - awsDashSdkLib.awsDashSdkLibStrings.LR
    - awsDashSdkLib.awsDashSdkLibStrings.LS
    - awsDashSdkLib.awsDashSdkLibStrings.LT
    - awsDashSdkLib.awsDashSdkLibStrings.LU
    - awsDashSdkLib.awsDashSdkLibStrings.LV
    - awsDashSdkLib.awsDashSdkLibStrings.LY
    - awsDashSdkLib.awsDashSdkLibStrings.MA
    - awsDashSdkLib.awsDashSdkLibStrings.MC
    - awsDashSdkLib.awsDashSdkLibStrings.MD
    - awsDashSdkLib.awsDashSdkLibStrings.ME
    - awsDashSdkLib.awsDashSdkLibStrings.MF
    - awsDashSdkLib.awsDashSdkLibStrings.MG
    - awsDashSdkLib.awsDashSdkLibStrings.MH
    - awsDashSdkLib.awsDashSdkLibStrings.MK
    - awsDashSdkLib.awsDashSdkLibStrings.ML
    - awsDashSdkLib.awsDashSdkLibStrings.MM
    - awsDashSdkLib.awsDashSdkLibStrings.MN
    - awsDashSdkLib.awsDashSdkLibStrings.MO
    - awsDashSdkLib.awsDashSdkLibStrings.MP
    - awsDashSdkLib.awsDashSdkLibStrings.MR
    - awsDashSdkLib.awsDashSdkLibStrings.MS
    - awsDashSdkLib.awsDashSdkLibStrings.MT
    - awsDashSdkLib.awsDashSdkLibStrings.MU
    - awsDashSdkLib.awsDashSdkLibStrings.MV
    - awsDashSdkLib.awsDashSdkLibStrings.MW
    - awsDashSdkLib.awsDashSdkLibStrings.MX
    - awsDashSdkLib.awsDashSdkLibStrings.MY
    - awsDashSdkLib.awsDashSdkLibStrings.MZ
    - awsDashSdkLib.awsDashSdkLibStrings.NA
    - awsDashSdkLib.awsDashSdkLibStrings.NC
    - awsDashSdkLib.awsDashSdkLibStrings.NE
    - awsDashSdkLib.awsDashSdkLibStrings.NG
    - awsDashSdkLib.awsDashSdkLibStrings.NI
    - awsDashSdkLib.awsDashSdkLibStrings.NL
    - awsDashSdkLib.awsDashSdkLibStrings.NO
    - awsDashSdkLib.awsDashSdkLibStrings.NP
    - awsDashSdkLib.awsDashSdkLibStrings.NR
    - awsDashSdkLib.awsDashSdkLibStrings.NU
    - awsDashSdkLib.awsDashSdkLibStrings.NZ
    - awsDashSdkLib.awsDashSdkLibStrings.OM
    - awsDashSdkLib.awsDashSdkLibStrings.PA
    - awsDashSdkLib.awsDashSdkLibStrings.PE
    - awsDashSdkLib.awsDashSdkLibStrings.PF
    - awsDashSdkLib.awsDashSdkLibStrings.PG
    - awsDashSdkLib.awsDashSdkLibStrings.PH
    - awsDashSdkLib.awsDashSdkLibStrings.PK
    - awsDashSdkLib.awsDashSdkLibStrings.PL
    - awsDashSdkLib.awsDashSdkLibStrings.PM
    - awsDashSdkLib.awsDashSdkLibStrings.PN
    - awsDashSdkLib.awsDashSdkLibStrings.PR
    - awsDashSdkLib.awsDashSdkLibStrings.PT
    - awsDashSdkLib.awsDashSdkLibStrings.PW
    - awsDashSdkLib.awsDashSdkLibStrings.PY
    - awsDashSdkLib.awsDashSdkLibStrings.QA
    - awsDashSdkLib.awsDashSdkLibStrings.RO
    - awsDashSdkLib.awsDashSdkLibStrings.RS
    - awsDashSdkLib.awsDashSdkLibStrings.RU
    - awsDashSdkLib.awsDashSdkLibStrings.RW
    - awsDashSdkLib.awsDashSdkLibStrings.SA
    - awsDashSdkLib.awsDashSdkLibStrings.SB
    - awsDashSdkLib.awsDashSdkLibStrings.SC
    - awsDashSdkLib.awsDashSdkLibStrings.SD
    - awsDashSdkLib.awsDashSdkLibStrings.SE
    - awsDashSdkLib.awsDashSdkLibStrings.SG
    - awsDashSdkLib.awsDashSdkLibStrings.SH
    - awsDashSdkLib.awsDashSdkLibStrings.SI
    - awsDashSdkLib.awsDashSdkLibStrings.SK
    - awsDashSdkLib.awsDashSdkLibStrings.SL
    - awsDashSdkLib.awsDashSdkLibStrings.SM
    - awsDashSdkLib.awsDashSdkLibStrings.SN
    - awsDashSdkLib.awsDashSdkLibStrings.SO
    - awsDashSdkLib.awsDashSdkLibStrings.SR
    - awsDashSdkLib.awsDashSdkLibStrings.ST
    - awsDashSdkLib.awsDashSdkLibStrings.SV
    - awsDashSdkLib.awsDashSdkLibStrings.SY
    - awsDashSdkLib.awsDashSdkLibStrings.SZ
    - awsDashSdkLib.awsDashSdkLibStrings.TC
    - awsDashSdkLib.awsDashSdkLibStrings.TD
    - awsDashSdkLib.awsDashSdkLibStrings.TG
    - awsDashSdkLib.awsDashSdkLibStrings.TH
    - awsDashSdkLib.awsDashSdkLibStrings.TJ
    - awsDashSdkLib.awsDashSdkLibStrings.TK
    - awsDashSdkLib.awsDashSdkLibStrings.TL
    - awsDashSdkLib.awsDashSdkLibStrings.TM
    - awsDashSdkLib.awsDashSdkLibStrings.TN
    - awsDashSdkLib.awsDashSdkLibStrings.TO
    - awsDashSdkLib.awsDashSdkLibStrings.TR
    - awsDashSdkLib.awsDashSdkLibStrings.TT
    - awsDashSdkLib.awsDashSdkLibStrings.TV
    - awsDashSdkLib.awsDashSdkLibStrings.TW
    - awsDashSdkLib.awsDashSdkLibStrings.TZ
    - awsDashSdkLib.awsDashSdkLibStrings.UA
    - awsDashSdkLib.awsDashSdkLibStrings.UG
    - awsDashSdkLib.awsDashSdkLibStrings.US
    - awsDashSdkLib.awsDashSdkLibStrings.UY
    - awsDashSdkLib.awsDashSdkLibStrings.UZ
    - awsDashSdkLib.awsDashSdkLibStrings.VA
    - awsDashSdkLib.awsDashSdkLibStrings.VC
    - awsDashSdkLib.awsDashSdkLibStrings.VE
    - awsDashSdkLib.awsDashSdkLibStrings.VG
    - awsDashSdkLib.awsDashSdkLibStrings.VI
    - awsDashSdkLib.awsDashSdkLibStrings.VN
    - awsDashSdkLib.awsDashSdkLibStrings.VU
    - awsDashSdkLib.awsDashSdkLibStrings.WF
    - awsDashSdkLib.awsDashSdkLibStrings.WS
    - awsDashSdkLib.awsDashSdkLibStrings.YE
    - awsDashSdkLib.awsDashSdkLibStrings.YT
    - awsDashSdkLib.awsDashSdkLibStrings.ZA
    - awsDashSdkLib.awsDashSdkLibStrings.ZM
    - awsDashSdkLib.awsDashSdkLibStrings.ZW
    - java.lang.String
  */
  type CountryCode = _CountryCode | java.lang.String
  type CurrentExpiryYear = scala.Double
  type DNSSec = java.lang.String
  type DomainAuthCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE_RESERVED
    - awsDashSdkLib.awsDashSdkLibStrings.AVAILABLE_PREORDER
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE_PREMIUM
    - awsDashSdkLib.awsDashSdkLibStrings.UNAVAILABLE_RESTRICTED
    - awsDashSdkLib.awsDashSdkLibStrings.RESERVED
    - awsDashSdkLib.awsDashSdkLibStrings.DONT_KNOW
    - java.lang.String
  */
  type DomainAvailability = _DomainAvailability | java.lang.String
  type DomainName = java.lang.String
  type DomainStatus = java.lang.String
  type DomainStatusList = js.Array[DomainStatus]
  type DomainSuggestionsList = js.Array[DomainSuggestion]
  type DomainSummaryList = js.Array[DomainSummary]
  type DurationInYears = scala.Double
  type Email = java.lang.String
  type ErrorMessage = java.lang.String
  type ExtraParamList = js.Array[ExtraParam]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.DUNS_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.BRAND_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.BIRTH_DEPARTMENT
    - awsDashSdkLib.awsDashSdkLibStrings.BIRTH_DATE_IN_YYYY_MM_DD
    - awsDashSdkLib.awsDashSdkLibStrings.BIRTH_COUNTRY
    - awsDashSdkLib.awsDashSdkLibStrings.BIRTH_CITY
    - awsDashSdkLib.awsDashSdkLibStrings.DOCUMENT_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.AU_ID_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.AU_ID_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_LEGAL_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.CA_BUSINESS_ENTITY_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.ES_IDENTIFICATION
    - awsDashSdkLib.awsDashSdkLibStrings.ES_IDENTIFICATION_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.ES_LEGAL_FORM
    - awsDashSdkLib.awsDashSdkLibStrings.FI_BUSINESS_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.FI_ID_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.FI_NATIONALITY
    - awsDashSdkLib.awsDashSdkLibStrings.FI_ORGANIZATION_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.IT_PIN
    - awsDashSdkLib.awsDashSdkLibStrings.IT_REGISTRANT_ENTITY_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.RU_PASSPORT_DATA
    - awsDashSdkLib.awsDashSdkLibStrings.SE_ID_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.SG_ID_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.VAT_NUMBER
    - awsDashSdkLib.awsDashSdkLibStrings.UK_CONTACT_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.UK_COMPANY_NUMBER
    - java.lang.String
  */
  type ExtraParamName = _ExtraParamName | java.lang.String
  type ExtraParamValue = java.lang.String
  type FIAuthKey = java.lang.String
  type GlueIp = java.lang.String
  type GlueIpList = js.Array[GlueIp]
  type HostName = java.lang.String
  type Integer = scala.Double
  type InvoiceId = java.lang.String
  type LangCode = java.lang.String
  type NameserverList = js.Array[Nameserver]
  type OperationId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUBMITTED
    - awsDashSdkLib.awsDashSdkLibStrings.IN_PROGRESS
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESSFUL
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type OperationStatus = _OperationStatus | java.lang.String
  type OperationSummaryList = js.Array[OperationSummary]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.REGISTER_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.DELETE_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.TRANSFER_IN_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_DOMAIN_CONTACT
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATE_NAMESERVER
    - awsDashSdkLib.awsDashSdkLibStrings.CHANGE_PRIVACY_PROTECTION
    - awsDashSdkLib.awsDashSdkLibStrings.DOMAIN_LOCK
    - awsDashSdkLib.awsDashSdkLibStrings.ENABLE_AUTORENEW
    - awsDashSdkLib.awsDashSdkLibStrings.DISABLE_AUTORENEW
    - awsDashSdkLib.awsDashSdkLibStrings.ADD_DNSSEC
    - awsDashSdkLib.awsDashSdkLibStrings.REMOVE_DNSSEC
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRE_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.TRANSFER_OUT_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.CHANGE_DOMAIN_OWNER
    - awsDashSdkLib.awsDashSdkLibStrings.RENEW_DOMAIN
    - awsDashSdkLib.awsDashSdkLibStrings.PUSH_DOMAIN
    - java.lang.String
  */
  type OperationType = _OperationType | java.lang.String
  type PageMarker = java.lang.String
  type PageMaxItems = scala.Double
  type Price = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.PENDING
    - awsDashSdkLib.awsDashSdkLibStrings.DONE
    - awsDashSdkLib.awsDashSdkLibStrings.EXPIRED
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
  type Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TRANSFERABLE
    - awsDashSdkLib.awsDashSdkLibStrings.UNTRANSFERABLE
    - awsDashSdkLib.awsDashSdkLibStrings.DONT_KNOW
    - java.lang.String
  */
  type Transferable = _Transferable | java.lang.String
  type ZipCode = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2014-05-15`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
