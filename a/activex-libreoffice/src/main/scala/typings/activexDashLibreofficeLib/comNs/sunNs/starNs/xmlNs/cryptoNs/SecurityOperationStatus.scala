package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SecurityOperationStatus extends js.Object

/** Defines results for security operation. */
@JSGlobal("com.sun.star.xml.crypto.SecurityOperationStatus")
@js.native
object SecurityOperationStatus extends js.Object {
  @js.native
  sealed trait ASSERTION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CERT_HAS_EXPIRED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CERT_ISSUER_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CERT_NOT_FOUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CERT_NOT_YET_VALID
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CERT_REVOKED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CERT_VERIFY_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait CRYPTO_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait DATA_NOT_MATCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait DISABLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait DSIG_INVALID_REFERENCE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait DSIG_NO_REFERENCES
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  /**
    * The following constants are derived from XMLSec error definitions, as following:
    *
    * XMLSEC_ERRORS_R_XMLSEC_FAILED XMLSEC_ERRORS_R_MALLOC_FAILED XMLSEC_ERRORS_R_STRDUP_FAILED XMLSEC_ERRORS_R_CRYPTO_FAILED XMLSEC_ERRORS_R_XML_FAILED
    * XMLSEC_ERRORS_R_XSLT_FAILED XMLSEC_ERRORS_R_IO_FAILED XMLSEC_ERRORS_R_DISABLED XMLSEC_ERRORS_R_NOT_IMPLEMENTED XMLSEC_ERRORS_R_INVALID_SIZE
    * XMLSEC_ERRORS_R_INVALID_DATA XMLSEC_ERRORS_R_INVALID_RESULT XMLSEC_ERRORS_R_INVALID_TYPE XMLSEC_ERRORS_R_INVALID_OPERATION
    * XMLSEC_ERRORS_R_INVALID_STATUS XMLSEC_ERRORS_R_INVALID_FORMAT XMLSEC_ERRORS_R_DATA_NOT_MATCH XMLSEC_ERRORS_R_INVALID_NODE
    * XMLSEC_ERRORS_R_INVALID_NODE_CONTENT XMLSEC_ERRORS_R_INVALID_NODE_ATTRIBUTE XMLSEC_ERRORS_R_MISSING_NODE_ATTRIBUTE
    * XMLSEC_ERRORS_R_NODE_ALREADY_PRESENT XMLSEC_ERRORS_R_UNEXPECTED_NODE XMLSEC_ERRORS_R_NODE_NOT_FOUND XMLSEC_ERRORS_R_INVALID_TRANSFORM
    * XMLSEC_ERRORS_R_INVALID_TRANSFORM_KEY XMLSEC_ERRORS_R_INVALID_URI_TYPE XMLSEC_ERRORS_R_TRANSFORM_SAME_DOCUMENT_REQUIRED
    * XMLSEC_ERRORS_R_TRANSFORM_DISABLED XMLSEC_ERRORS_R_INVALID_KEY_DATA XMLSEC_ERRORS_R_KEY_DATA_NOT_FOUND XMLSEC_ERRORS_R_KEY_DATA_ALREADY_EXIST
    * XMLSEC_ERRORS_R_INVALID_KEY_DATA_SIZE XMLSEC_ERRORS_R_KEY_NOT_FOUND XMLSEC_ERRORS_R_KEYDATA_DISABLED XMLSEC_ERRORS_R_MAX_RETRIEVALS_LEVEL
    * XMLSEC_ERRORS_R_MAX_RETRIEVAL_TYPE_MISMATCH XMLSEC_ERRORS_R_MAX_ENCKEY_LEVEL XMLSEC_ERRORS_R_CERT_VERIFY_FAILED XMLSEC_ERRORS_R_CERT_NOT_FOUND
    * XMLSEC_ERRORS_R_CERT_REVOKED XMLSEC_ERRORS_R_CERT_ISSUER_FAILED XMLSEC_ERRORS_R_CERT_NOT_YET_VALID XMLSEC_ERRORS_R_CERT_HAS_EXPIRED
    * XMLSEC_ERRORS_R_DSIG_NO_REFERENCES XMLSEC_ERRORS_R_DSIG_INVALID_REFERENCE XMLSEC_ERRORS_R_ASSERTION XMLSEC_ERRORS_MAX_NUMBER
    */
  @js.native
  sealed trait ENGINE_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_DATA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_FORMAT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_KEY_DATA
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_KEY_DATA_SIZE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_NODE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_NODE_ATTRIBUTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_NODE_CONTENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_OPERATION
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_RESULT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_SIZE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_STATUS
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_TRANSFORM
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_TRANSFORM_KEY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_TYPE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait INVALID_URI_TYPE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait IO_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait KEYDATA_DISABLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait KEY_DATA_ALREADY_EXIST
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait KEY_DATA_NOT_FOUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait KEY_NOT_FOUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait MALLOC_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait MAX_ENCKEY_LEVEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait MAX_RETRIEVALS_LEVEL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait MAX_RETRIEVAL_TYPE_MISMATCH
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait MISSING_NODE_ATTRIBUTE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait NODE_ALREADY_PRESENT
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait NODE_NOT_FOUND
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait NOT_IMPLEMENTED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait OPERATION_SUCCEEDED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait RUNTIMEERROR_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait STRDUP_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait TRANSFORM_DISABLED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait TRANSFORM_SAME_DOCUMENT_REQUIRED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait UNEXPECTED_NODE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait UNKNOWN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait XML_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  @js.native
  sealed trait XSLT_FAILED
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus
  
  /* 49 */ val ASSERTION: ASSERTION with scala.Double = js.native
  /* 46 */ val CERT_HAS_EXPIRED: CERT_HAS_EXPIRED with scala.Double = js.native
  /* 44 */ val CERT_ISSUER_FAILED: CERT_ISSUER_FAILED with scala.Double = js.native
  /* 42 */ val CERT_NOT_FOUND: CERT_NOT_FOUND with scala.Double = js.native
  /* 45 */ val CERT_NOT_YET_VALID: CERT_NOT_YET_VALID with scala.Double = js.native
  /* 43 */ val CERT_REVOKED: CERT_REVOKED with scala.Double = js.native
  /* 41 */ val CERT_VERIFY_FAILED: CERT_VERIFY_FAILED with scala.Double = js.native
  /* 6 */ val CRYPTO_FAILED: CRYPTO_FAILED with scala.Double = js.native
  /* 19 */ val DATA_NOT_MATCH: DATA_NOT_MATCH with scala.Double = js.native
  /* 10 */ val DISABLED: DISABLED with scala.Double = js.native
  /* 48 */ val DSIG_INVALID_REFERENCE: DSIG_INVALID_REFERENCE with scala.Double = js.native
  /* 47 */ val DSIG_NO_REFERENCES: DSIG_NO_REFERENCES with scala.Double = js.native
  /* 3 */ val ENGINE_FAILED: ENGINE_FAILED with scala.Double = js.native
  /* 13 */ val INVALID_DATA: INVALID_DATA with scala.Double = js.native
  /* 18 */ val INVALID_FORMAT: INVALID_FORMAT with scala.Double = js.native
  /* 32 */ val INVALID_KEY_DATA: INVALID_KEY_DATA with scala.Double = js.native
  /* 35 */ val INVALID_KEY_DATA_SIZE: INVALID_KEY_DATA_SIZE with scala.Double = js.native
  /* 20 */ val INVALID_NODE: INVALID_NODE with scala.Double = js.native
  /* 22 */ val INVALID_NODE_ATTRIBUTE: INVALID_NODE_ATTRIBUTE with scala.Double = js.native
  /* 21 */ val INVALID_NODE_CONTENT: INVALID_NODE_CONTENT with scala.Double = js.native
  /* 16 */ val INVALID_OPERATION: INVALID_OPERATION with scala.Double = js.native
  /* 14 */ val INVALID_RESULT: INVALID_RESULT with scala.Double = js.native
  /* 12 */ val INVALID_SIZE: INVALID_SIZE with scala.Double = js.native
  /* 17 */ val INVALID_STATUS: INVALID_STATUS with scala.Double = js.native
  /* 27 */ val INVALID_TRANSFORM: INVALID_TRANSFORM with scala.Double = js.native
  /* 28 */ val INVALID_TRANSFORM_KEY: INVALID_TRANSFORM_KEY with scala.Double = js.native
  /* 15 */ val INVALID_TYPE: INVALID_TYPE with scala.Double = js.native
  /* 29 */ val INVALID_URI_TYPE: INVALID_URI_TYPE with scala.Double = js.native
  /* 9 */ val IO_FAILED: IO_FAILED with scala.Double = js.native
  /* 37 */ val KEYDATA_DISABLED: KEYDATA_DISABLED with scala.Double = js.native
  /* 34 */ val KEY_DATA_ALREADY_EXIST: KEY_DATA_ALREADY_EXIST with scala.Double = js.native
  /* 33 */ val KEY_DATA_NOT_FOUND: KEY_DATA_NOT_FOUND with scala.Double = js.native
  /* 36 */ val KEY_NOT_FOUND: KEY_NOT_FOUND with scala.Double = js.native
  /* 4 */ val MALLOC_FAILED: MALLOC_FAILED with scala.Double = js.native
  /* 40 */ val MAX_ENCKEY_LEVEL: MAX_ENCKEY_LEVEL with scala.Double = js.native
  /* 38 */ val MAX_RETRIEVALS_LEVEL: MAX_RETRIEVALS_LEVEL with scala.Double = js.native
  /* 39 */ val MAX_RETRIEVAL_TYPE_MISMATCH: MAX_RETRIEVAL_TYPE_MISMATCH with scala.Double = js.native
  /* 23 */ val MISSING_NODE_ATTRIBUTE: MISSING_NODE_ATTRIBUTE with scala.Double = js.native
  /* 24 */ val NODE_ALREADY_PRESENT: NODE_ALREADY_PRESENT with scala.Double = js.native
  /* 26 */ val NODE_NOT_FOUND: NODE_NOT_FOUND with scala.Double = js.native
  /* 11 */ val NOT_IMPLEMENTED: NOT_IMPLEMENTED with scala.Double = js.native
  /* 1 */ val OPERATION_SUCCEEDED: OPERATION_SUCCEEDED with scala.Double = js.native
  /* 2 */ val RUNTIMEERROR_FAILED: RUNTIMEERROR_FAILED with scala.Double = js.native
  /* 5 */ val STRDUP_FAILED: STRDUP_FAILED with scala.Double = js.native
  /* 31 */ val TRANSFORM_DISABLED: TRANSFORM_DISABLED with scala.Double = js.native
  /* 30 */ val TRANSFORM_SAME_DOCUMENT_REQUIRED: TRANSFORM_SAME_DOCUMENT_REQUIRED with scala.Double = js.native
  /* 25 */ val UNEXPECTED_NODE: UNEXPECTED_NODE with scala.Double = js.native
  /* 0 */ val UNKNOWN: UNKNOWN with scala.Double = js.native
  /* 7 */ val XML_FAILED: XML_FAILED with scala.Double = js.native
  /* 8 */ val XSLT_FAILED: XSLT_FAILED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.xmlNs.cryptoNs.SecurityOperationStatus with scala.Double
  ] = js.native
}

