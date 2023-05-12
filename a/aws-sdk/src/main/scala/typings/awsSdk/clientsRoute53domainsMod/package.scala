package typings.awsSdk.clientsRoute53domainsMod

import typings.awsSdk.awsSdkStrings.SubmittedDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AccountId = java.lang.String

type AddressLine = java.lang.String

type BillingRecords = js.Array[BillingRecord]

type Boolean = scala.Boolean

type City = java.lang.String

type ContactName = java.lang.String

type ContactNumber = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSON
  - typings.awsSdk.awsSdkStrings.COMPANY
  - typings.awsSdk.awsSdkStrings.ASSOCIATION
  - typings.awsSdk.awsSdkStrings.PUBLIC_BODY
  - typings.awsSdk.awsSdkStrings.RESELLER
  - java.lang.String
*/
type ContactType = _ContactType | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AC
  - typings.awsSdk.awsSdkStrings.AD
  - typings.awsSdk.awsSdkStrings.AE
  - typings.awsSdk.awsSdkStrings.AF
  - typings.awsSdk.awsSdkStrings.AG
  - typings.awsSdk.awsSdkStrings.AI
  - typings.awsSdk.awsSdkStrings.AL
  - typings.awsSdk.awsSdkStrings.AM
  - typings.awsSdk.awsSdkStrings.AN
  - typings.awsSdk.awsSdkStrings.AO
  - typings.awsSdk.awsSdkStrings.AQ
  - typings.awsSdk.awsSdkStrings.AR
  - typings.awsSdk.awsSdkStrings.AS
  - typings.awsSdk.awsSdkStrings.AT
  - typings.awsSdk.awsSdkStrings.AU
  - typings.awsSdk.awsSdkStrings.AW
  - typings.awsSdk.awsSdkStrings.AX
  - typings.awsSdk.awsSdkStrings.AZ
  - typings.awsSdk.awsSdkStrings.BA
  - typings.awsSdk.awsSdkStrings.BB
  - typings.awsSdk.awsSdkStrings.BD
  - typings.awsSdk.awsSdkStrings.BE
  - typings.awsSdk.awsSdkStrings.BF
  - typings.awsSdk.awsSdkStrings.BG
  - typings.awsSdk.awsSdkStrings.BH
  - typings.awsSdk.awsSdkStrings.BI
  - typings.awsSdk.awsSdkStrings.BJ
  - typings.awsSdk.awsSdkStrings.BL
  - typings.awsSdk.awsSdkStrings.BM
  - typings.awsSdk.awsSdkStrings.BN
  - typings.awsSdk.awsSdkStrings.BO
  - typings.awsSdk.awsSdkStrings.BQ
  - typings.awsSdk.awsSdkStrings.BR
  - typings.awsSdk.awsSdkStrings.BS
  - typings.awsSdk.awsSdkStrings.BT
  - typings.awsSdk.awsSdkStrings.BV
  - typings.awsSdk.awsSdkStrings.BW
  - typings.awsSdk.awsSdkStrings.BY
  - typings.awsSdk.awsSdkStrings.BZ
  - typings.awsSdk.awsSdkStrings.CA
  - typings.awsSdk.awsSdkStrings.CC
  - typings.awsSdk.awsSdkStrings.CD
  - typings.awsSdk.awsSdkStrings.CF
  - typings.awsSdk.awsSdkStrings.CG
  - typings.awsSdk.awsSdkStrings.CH
  - typings.awsSdk.awsSdkStrings.CI
  - typings.awsSdk.awsSdkStrings.CK
  - typings.awsSdk.awsSdkStrings.CL
  - typings.awsSdk.awsSdkStrings.CM
  - typings.awsSdk.awsSdkStrings.CN
  - typings.awsSdk.awsSdkStrings.CO
  - typings.awsSdk.awsSdkStrings.CR
  - typings.awsSdk.awsSdkStrings.CU
  - typings.awsSdk.awsSdkStrings.CV
  - typings.awsSdk.awsSdkStrings.CW
  - typings.awsSdk.awsSdkStrings.CX
  - typings.awsSdk.awsSdkStrings.CY
  - typings.awsSdk.awsSdkStrings.CZ
  - typings.awsSdk.awsSdkStrings.DE
  - typings.awsSdk.awsSdkStrings.DJ
  - typings.awsSdk.awsSdkStrings.DK
  - typings.awsSdk.awsSdkStrings.DM
  - typings.awsSdk.awsSdkStrings.DO
  - typings.awsSdk.awsSdkStrings.DZ
  - typings.awsSdk.awsSdkStrings.EC
  - typings.awsSdk.awsSdkStrings.EE
  - typings.awsSdk.awsSdkStrings.EG
  - typings.awsSdk.awsSdkStrings.EH
  - typings.awsSdk.awsSdkStrings.ER
  - typings.awsSdk.awsSdkStrings.ES
  - typings.awsSdk.awsSdkStrings.ET
  - typings.awsSdk.awsSdkStrings.FI
  - typings.awsSdk.awsSdkStrings.FJ
  - typings.awsSdk.awsSdkStrings.FK
  - typings.awsSdk.awsSdkStrings.FM
  - typings.awsSdk.awsSdkStrings.FO
  - typings.awsSdk.awsSdkStrings.FR
  - typings.awsSdk.awsSdkStrings.GA
  - typings.awsSdk.awsSdkStrings.GB
  - typings.awsSdk.awsSdkStrings.GD
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.GF
  - typings.awsSdk.awsSdkStrings.GG
  - typings.awsSdk.awsSdkStrings.GH
  - typings.awsSdk.awsSdkStrings.GI
  - typings.awsSdk.awsSdkStrings.GL
  - typings.awsSdk.awsSdkStrings.GM
  - typings.awsSdk.awsSdkStrings.GN
  - typings.awsSdk.awsSdkStrings.GP
  - typings.awsSdk.awsSdkStrings.GQ
  - typings.awsSdk.awsSdkStrings.GR
  - typings.awsSdk.awsSdkStrings.GS
  - typings.awsSdk.awsSdkStrings.GT
  - typings.awsSdk.awsSdkStrings.GU
  - typings.awsSdk.awsSdkStrings.GW
  - typings.awsSdk.awsSdkStrings.GY
  - typings.awsSdk.awsSdkStrings.HK
  - typings.awsSdk.awsSdkStrings.HM
  - typings.awsSdk.awsSdkStrings.HN
  - typings.awsSdk.awsSdkStrings.HR
  - typings.awsSdk.awsSdkStrings.HT
  - typings.awsSdk.awsSdkStrings.HU
  - typings.awsSdk.awsSdkStrings.ID
  - typings.awsSdk.awsSdkStrings.IE
  - typings.awsSdk.awsSdkStrings.IL
  - typings.awsSdk.awsSdkStrings.IM
  - typings.awsSdk.awsSdkStrings.IN
  - typings.awsSdk.awsSdkStrings.IO
  - typings.awsSdk.awsSdkStrings.IQ
  - typings.awsSdk.awsSdkStrings.IR
  - typings.awsSdk.awsSdkStrings.IS
  - typings.awsSdk.awsSdkStrings.IT
  - typings.awsSdk.awsSdkStrings.JE
  - typings.awsSdk.awsSdkStrings.JM
  - typings.awsSdk.awsSdkStrings.JO
  - typings.awsSdk.awsSdkStrings.JP
  - typings.awsSdk.awsSdkStrings.KE
  - typings.awsSdk.awsSdkStrings.KG
  - typings.awsSdk.awsSdkStrings.KH
  - typings.awsSdk.awsSdkStrings.KI
  - typings.awsSdk.awsSdkStrings.KM
  - typings.awsSdk.awsSdkStrings.KN
  - typings.awsSdk.awsSdkStrings.KP
  - typings.awsSdk.awsSdkStrings.KR
  - typings.awsSdk.awsSdkStrings.KW
  - typings.awsSdk.awsSdkStrings.KY
  - typings.awsSdk.awsSdkStrings.KZ
  - typings.awsSdk.awsSdkStrings.LA
  - typings.awsSdk.awsSdkStrings.LB
  - typings.awsSdk.awsSdkStrings.LC
  - typings.awsSdk.awsSdkStrings.LI
  - typings.awsSdk.awsSdkStrings.LK
  - typings.awsSdk.awsSdkStrings.LR
  - typings.awsSdk.awsSdkStrings.LS
  - typings.awsSdk.awsSdkStrings.LT
  - typings.awsSdk.awsSdkStrings.LU
  - typings.awsSdk.awsSdkStrings.LV
  - typings.awsSdk.awsSdkStrings.LY
  - typings.awsSdk.awsSdkStrings.MA
  - typings.awsSdk.awsSdkStrings.MC
  - typings.awsSdk.awsSdkStrings.MD
  - typings.awsSdk.awsSdkStrings.ME
  - typings.awsSdk.awsSdkStrings.MF
  - typings.awsSdk.awsSdkStrings.MG
  - typings.awsSdk.awsSdkStrings.MH
  - typings.awsSdk.awsSdkStrings.MK
  - typings.awsSdk.awsSdkStrings.ML
  - typings.awsSdk.awsSdkStrings.MM
  - typings.awsSdk.awsSdkStrings.MN
  - typings.awsSdk.awsSdkStrings.MO
  - typings.awsSdk.awsSdkStrings.MP
  - typings.awsSdk.awsSdkStrings.MQ
  - typings.awsSdk.awsSdkStrings.MR
  - typings.awsSdk.awsSdkStrings.MS
  - typings.awsSdk.awsSdkStrings.MT
  - typings.awsSdk.awsSdkStrings.MU
  - typings.awsSdk.awsSdkStrings.MV
  - typings.awsSdk.awsSdkStrings.MW
  - typings.awsSdk.awsSdkStrings.MX
  - typings.awsSdk.awsSdkStrings.MY
  - typings.awsSdk.awsSdkStrings.MZ
  - typings.awsSdk.awsSdkStrings.NA
  - typings.awsSdk.awsSdkStrings.NC
  - typings.awsSdk.awsSdkStrings.NE
  - typings.awsSdk.awsSdkStrings.NF
  - typings.awsSdk.awsSdkStrings.NG
  - typings.awsSdk.awsSdkStrings.NI
  - typings.awsSdk.awsSdkStrings.NL
  - typings.awsSdk.awsSdkStrings.NO
  - typings.awsSdk.awsSdkStrings.NP
  - typings.awsSdk.awsSdkStrings.NR
  - typings.awsSdk.awsSdkStrings.NU
  - typings.awsSdk.awsSdkStrings.NZ
  - typings.awsSdk.awsSdkStrings.OM
  - typings.awsSdk.awsSdkStrings.PA
  - typings.awsSdk.awsSdkStrings.PE
  - typings.awsSdk.awsSdkStrings.PF
  - typings.awsSdk.awsSdkStrings.PG
  - typings.awsSdk.awsSdkStrings.PH
  - typings.awsSdk.awsSdkStrings.PK
  - typings.awsSdk.awsSdkStrings.PL
  - typings.awsSdk.awsSdkStrings.PM
  - typings.awsSdk.awsSdkStrings.PN
  - typings.awsSdk.awsSdkStrings.PR
  - typings.awsSdk.awsSdkStrings.PS
  - typings.awsSdk.awsSdkStrings.PT
  - typings.awsSdk.awsSdkStrings.PW
  - typings.awsSdk.awsSdkStrings.PY
  - typings.awsSdk.awsSdkStrings.QA
  - typings.awsSdk.awsSdkStrings.RE
  - typings.awsSdk.awsSdkStrings.RO
  - typings.awsSdk.awsSdkStrings.RS
  - typings.awsSdk.awsSdkStrings.RU
  - typings.awsSdk.awsSdkStrings.RW
  - typings.awsSdk.awsSdkStrings.SA
  - typings.awsSdk.awsSdkStrings.SB
  - typings.awsSdk.awsSdkStrings.SC
  - typings.awsSdk.awsSdkStrings.SD
  - typings.awsSdk.awsSdkStrings.SE
  - typings.awsSdk.awsSdkStrings.SG
  - typings.awsSdk.awsSdkStrings.SH
  - typings.awsSdk.awsSdkStrings.SI
  - typings.awsSdk.awsSdkStrings.SJ
  - typings.awsSdk.awsSdkStrings.SK
  - typings.awsSdk.awsSdkStrings.SL
  - typings.awsSdk.awsSdkStrings.SM
  - typings.awsSdk.awsSdkStrings.SN
  - typings.awsSdk.awsSdkStrings.SO
  - typings.awsSdk.awsSdkStrings.SR
  - typings.awsSdk.awsSdkStrings.SS
  - typings.awsSdk.awsSdkStrings.ST
  - typings.awsSdk.awsSdkStrings.SV
  - typings.awsSdk.awsSdkStrings.SX
  - typings.awsSdk.awsSdkStrings.SY
  - typings.awsSdk.awsSdkStrings.SZ
  - typings.awsSdk.awsSdkStrings.TC
  - typings.awsSdk.awsSdkStrings.TD
  - typings.awsSdk.awsSdkStrings.TF
  - typings.awsSdk.awsSdkStrings.TG
  - typings.awsSdk.awsSdkStrings.TH
  - typings.awsSdk.awsSdkStrings.TJ
  - typings.awsSdk.awsSdkStrings.TK
  - typings.awsSdk.awsSdkStrings.TL
  - typings.awsSdk.awsSdkStrings.TM
  - typings.awsSdk.awsSdkStrings.TN
  - typings.awsSdk.awsSdkStrings.TO
  - typings.awsSdk.awsSdkStrings.TP
  - typings.awsSdk.awsSdkStrings.TR
  - typings.awsSdk.awsSdkStrings.TT
  - typings.awsSdk.awsSdkStrings.TV
  - typings.awsSdk.awsSdkStrings.TW
  - typings.awsSdk.awsSdkStrings.TZ
  - typings.awsSdk.awsSdkStrings.UA
  - typings.awsSdk.awsSdkStrings.UG
  - typings.awsSdk.awsSdkStrings.US
  - typings.awsSdk.awsSdkStrings.UY
  - typings.awsSdk.awsSdkStrings.UZ
  - typings.awsSdk.awsSdkStrings.VA
  - typings.awsSdk.awsSdkStrings.VC
  - typings.awsSdk.awsSdkStrings.VE
  - typings.awsSdk.awsSdkStrings.VG
  - typings.awsSdk.awsSdkStrings.VI
  - typings.awsSdk.awsSdkStrings.VN
  - typings.awsSdk.awsSdkStrings.VU
  - typings.awsSdk.awsSdkStrings.WF
  - typings.awsSdk.awsSdkStrings.WS
  - typings.awsSdk.awsSdkStrings.YE
  - typings.awsSdk.awsSdkStrings.YT
  - typings.awsSdk.awsSdkStrings.ZA
  - typings.awsSdk.awsSdkStrings.ZM
  - typings.awsSdk.awsSdkStrings.ZW
  - java.lang.String
*/
type CountryCode = _CountryCode | java.lang.String

type Currency = java.lang.String

type CurrentExpiryYear = Double

type DNSSec = java.lang.String

type DnssecKeyList = js.Array[DnssecKey]

type DnssecPublicKey = java.lang.String

type DomainAuthCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AVAILABLE
  - typings.awsSdk.awsSdkStrings.AVAILABLE_RESERVED
  - typings.awsSdk.awsSdkStrings.AVAILABLE_PREORDER
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE_PREMIUM
  - typings.awsSdk.awsSdkStrings.UNAVAILABLE_RESTRICTED
  - typings.awsSdk.awsSdkStrings.RESERVED
  - typings.awsSdk.awsSdkStrings.DONT_KNOW
  - java.lang.String
*/
type DomainAvailability = _DomainAvailability | java.lang.String

type DomainName = java.lang.String

type DomainPriceList = js.Array[DomainPrice]

type DomainPriceName = java.lang.String

type DomainStatus = java.lang.String

type DomainStatusList = js.Array[DomainStatus]

type DomainSuggestionsList = js.Array[DomainSuggestion]

type DomainSummaryList = js.Array[DomainSummary]

type DurationInYears = Double

type Email = java.lang.String

type ErrorMessage = java.lang.String

type ExtraParamList = js.Array[ExtraParam]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DUNS_NUMBER
  - typings.awsSdk.awsSdkStrings.BRAND_NUMBER
  - typings.awsSdk.awsSdkStrings.BIRTH_DEPARTMENT
  - typings.awsSdk.awsSdkStrings.BIRTH_DATE_IN_YYYY_MM_DD
  - typings.awsSdk.awsSdkStrings.BIRTH_COUNTRY
  - typings.awsSdk.awsSdkStrings.BIRTH_CITY
  - typings.awsSdk.awsSdkStrings.DOCUMENT_NUMBER
  - typings.awsSdk.awsSdkStrings.AU_ID_NUMBER
  - typings.awsSdk.awsSdkStrings.AU_ID_TYPE
  - typings.awsSdk.awsSdkStrings.CA_LEGAL_TYPE
  - typings.awsSdk.awsSdkStrings.CA_BUSINESS_ENTITY_TYPE
  - typings.awsSdk.awsSdkStrings.CA_LEGAL_REPRESENTATIVE
  - typings.awsSdk.awsSdkStrings.CA_LEGAL_REPRESENTATIVE_CAPACITY
  - typings.awsSdk.awsSdkStrings.ES_IDENTIFICATION
  - typings.awsSdk.awsSdkStrings.ES_IDENTIFICATION_TYPE
  - typings.awsSdk.awsSdkStrings.ES_LEGAL_FORM
  - typings.awsSdk.awsSdkStrings.FI_BUSINESS_NUMBER
  - typings.awsSdk.awsSdkStrings.FI_ID_NUMBER
  - typings.awsSdk.awsSdkStrings.FI_NATIONALITY
  - typings.awsSdk.awsSdkStrings.FI_ORGANIZATION_TYPE
  - typings.awsSdk.awsSdkStrings.IT_NATIONALITY
  - typings.awsSdk.awsSdkStrings.IT_PIN
  - typings.awsSdk.awsSdkStrings.IT_REGISTRANT_ENTITY_TYPE
  - typings.awsSdk.awsSdkStrings.RU_PASSPORT_DATA
  - typings.awsSdk.awsSdkStrings.SE_ID_NUMBER
  - typings.awsSdk.awsSdkStrings.SG_ID_NUMBER
  - typings.awsSdk.awsSdkStrings.VAT_NUMBER
  - typings.awsSdk.awsSdkStrings.UK_CONTACT_TYPE
  - typings.awsSdk.awsSdkStrings.UK_COMPANY_NUMBER
  - typings.awsSdk.awsSdkStrings.EU_COUNTRY_OF_CITIZENSHIP
  - typings.awsSdk.awsSdkStrings.AU_PRIORITY_TOKEN
  - java.lang.String
*/
type ExtraParamName = _ExtraParamName | java.lang.String

type ExtraParamValue = java.lang.String

type FIAuthKey = java.lang.String

type FilterConditions = js.Array[FilterCondition]

type GlueIp = java.lang.String

type GlueIpList = js.Array[GlueIp]

type HostName = java.lang.String

type Integer = Double

type InvoiceId = java.lang.String

type Label = java.lang.String

type LangCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DomainName
  - typings.awsSdk.awsSdkStrings.Expiry
  - java.lang.String
*/
type ListDomainsAttributeName = _ListDomainsAttributeName | java.lang.String

type ListOperationsSortAttributeName = SubmittedDate | java.lang.String

type NameserverList = js.Array[Nameserver]

type NullableInteger = Double

type OperationId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SUBMITTED
  - typings.awsSdk.awsSdkStrings.IN_PROGRESS
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.SUCCESSFUL
  - typings.awsSdk.awsSdkStrings.FAILED
  - java.lang.String
*/
type OperationStatus = _OperationStatus | java.lang.String

type OperationStatusList = js.Array[OperationStatus]

type OperationSummaryList = js.Array[OperationSummary]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGISTER_DOMAIN
  - typings.awsSdk.awsSdkStrings.DELETE_DOMAIN
  - typings.awsSdk.awsSdkStrings.TRANSFER_IN_DOMAIN
  - typings.awsSdk.awsSdkStrings.UPDATE_DOMAIN_CONTACT
  - typings.awsSdk.awsSdkStrings.UPDATE_NAMESERVER
  - typings.awsSdk.awsSdkStrings.CHANGE_PRIVACY_PROTECTION
  - typings.awsSdk.awsSdkStrings.DOMAIN_LOCK
  - typings.awsSdk.awsSdkStrings.ENABLE_AUTORENEW
  - typings.awsSdk.awsSdkStrings.DISABLE_AUTORENEW
  - typings.awsSdk.awsSdkStrings.ADD_DNSSEC
  - typings.awsSdk.awsSdkStrings.REMOVE_DNSSEC
  - typings.awsSdk.awsSdkStrings.EXPIRE_DOMAIN
  - typings.awsSdk.awsSdkStrings.TRANSFER_OUT_DOMAIN
  - typings.awsSdk.awsSdkStrings.CHANGE_DOMAIN_OWNER
  - typings.awsSdk.awsSdkStrings.RENEW_DOMAIN
  - typings.awsSdk.awsSdkStrings.PUSH_DOMAIN
  - typings.awsSdk.awsSdkStrings.INTERNAL_TRANSFER_OUT_DOMAIN
  - typings.awsSdk.awsSdkStrings.INTERNAL_TRANSFER_IN_DOMAIN
  - java.lang.String
*/
type OperationType = _OperationType | java.lang.String

type OperationTypeList = js.Array[OperationType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LE
  - typings.awsSdk.awsSdkStrings.GE
  - typings.awsSdk.awsSdkStrings.BEGINS_WITH
  - java.lang.String
*/
type Operator = _Operator | java.lang.String

type PageMarker = java.lang.String

type PageMaxItems = Double

type Price = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING
  - typings.awsSdk.awsSdkStrings.DONE
  - typings.awsSdk.awsSdkStrings.EXPIRED
  - java.lang.String
*/
type ReachabilityStatus = _ReachabilityStatus | java.lang.String

type RegistrarName = java.lang.String

type RegistrarUrl = java.lang.String

type RegistrarWhoIsServer = java.lang.String

type RegistryDomainId = java.lang.String

type Reseller = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ASC
  - typings.awsSdk.awsSdkStrings.DESC
  - java.lang.String
*/
type SortOrder = _SortOrder | java.lang.String

type State = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PENDING_ACCEPTANCE
  - typings.awsSdk.awsSdkStrings.PENDING_CUSTOMER_ACTION
  - typings.awsSdk.awsSdkStrings.PENDING_AUTHORIZATION
  - typings.awsSdk.awsSdkStrings.PENDING_PAYMENT_VERIFICATION
  - typings.awsSdk.awsSdkStrings.PENDING_SUPPORT_CASE
  - java.lang.String
*/
type StatusFlag = _StatusFlag | java.lang.String

type String = java.lang.String

type TagKey = java.lang.String

type TagKeyList = js.Array[TagKey]

type TagList = js.Array[Tag]

type TagValue = java.lang.String

type Timestamp = js.Date

type TldName = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.TRANSFERABLE
  - typings.awsSdk.awsSdkStrings.UNTRANSFERABLE
  - typings.awsSdk.awsSdkStrings.DONT_KNOW
  - typings.awsSdk.awsSdkStrings.DOMAIN_IN_OWN_ACCOUNT
  - typings.awsSdk.awsSdkStrings.DOMAIN_IN_ANOTHER_ACCOUNT
  - typings.awsSdk.awsSdkStrings.PREMIUM_DOMAIN
  - java.lang.String
*/
type Transferable = _Transferable | java.lang.String

type Value = java.lang.String

type Values = js.Array[Value]

type ZipCode = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2014-05-15`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
