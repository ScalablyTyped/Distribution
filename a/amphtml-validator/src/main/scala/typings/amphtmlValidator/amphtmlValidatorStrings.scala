package typings.amphtmlValidator

import typings.amphtmlValidator.mod.ValidationErrorCode
import typings.amphtmlValidator.mod.ValidationErrorSeverity
import typings.amphtmlValidator.mod.ValidationResultStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amphtmlValidatorStrings {
  
  @js.native
  sealed trait ATTR_DISALLOWED_BY_IMPLIED_LAYOUT
    extends StObject
       with ValidationErrorCode
  inline def ATTR_DISALLOWED_BY_IMPLIED_LAYOUT: ATTR_DISALLOWED_BY_IMPLIED_LAYOUT = "ATTR_DISALLOWED_BY_IMPLIED_LAYOUT".asInstanceOf[ATTR_DISALLOWED_BY_IMPLIED_LAYOUT]
  
  @js.native
  sealed trait ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT
    extends StObject
       with ValidationErrorCode
  inline def ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT: ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT = "ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT".asInstanceOf[ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT]
  
  @js.native
  sealed trait ATTR_MISSING_REQUIRED_EXTENSION
    extends StObject
       with ValidationErrorCode
  inline def ATTR_MISSING_REQUIRED_EXTENSION: ATTR_MISSING_REQUIRED_EXTENSION = "ATTR_MISSING_REQUIRED_EXTENSION".asInstanceOf[ATTR_MISSING_REQUIRED_EXTENSION]
  
  @js.native
  sealed trait ATTR_REQUIRED_BUT_MISSING
    extends StObject
       with ValidationErrorCode
  inline def ATTR_REQUIRED_BUT_MISSING: ATTR_REQUIRED_BUT_MISSING = "ATTR_REQUIRED_BUT_MISSING".asInstanceOf[ATTR_REQUIRED_BUT_MISSING]
  
  @js.native
  sealed trait ATTR_VALUE_REQUIRED_BY_LAYOUT
    extends StObject
       with ValidationErrorCode
  inline def ATTR_VALUE_REQUIRED_BY_LAYOUT: ATTR_VALUE_REQUIRED_BY_LAYOUT = "ATTR_VALUE_REQUIRED_BY_LAYOUT".asInstanceOf[ATTR_VALUE_REQUIRED_BY_LAYOUT]
  
  @js.native
  sealed trait BASE_TAG_MUST_PRECEED_ALL_URLS
    extends StObject
       with ValidationErrorCode
  inline def BASE_TAG_MUST_PRECEED_ALL_URLS: BASE_TAG_MUST_PRECEED_ALL_URLS = "BASE_TAG_MUST_PRECEED_ALL_URLS".asInstanceOf[BASE_TAG_MUST_PRECEED_ALL_URLS]
  
  @js.native
  sealed trait CDATA_VIOLATES_BLACKLIST
    extends StObject
       with ValidationErrorCode
  inline def CDATA_VIOLATES_BLACKLIST: CDATA_VIOLATES_BLACKLIST = "CDATA_VIOLATES_BLACKLIST".asInstanceOf[CDATA_VIOLATES_BLACKLIST]
  
  @js.native
  sealed trait CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT
    extends StObject
       with ValidationErrorCode
  inline def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT: CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT = "CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT".asInstanceOf[CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT]
  
  @js.native
  sealed trait CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR
    extends StObject
       with ValidationErrorCode
  inline def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR: CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR = "CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR".asInstanceOf[CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR]
  
  @js.native
  sealed trait CSS_EXCESSIVELY_NESTED
    extends StObject
       with ValidationErrorCode
  inline def CSS_EXCESSIVELY_NESTED: CSS_EXCESSIVELY_NESTED = "CSS_EXCESSIVELY_NESTED".asInstanceOf[CSS_EXCESSIVELY_NESTED]
  
  @js.native
  sealed trait CSS_SYNTAX_BAD_URL
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_BAD_URL: CSS_SYNTAX_BAD_URL = "CSS_SYNTAX_BAD_URL".asInstanceOf[CSS_SYNTAX_BAD_URL]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_DOMAIN
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_DOMAIN: CSS_SYNTAX_DISALLOWED_DOMAIN = "CSS_SYNTAX_DISALLOWED_DOMAIN".asInstanceOf[CSS_SYNTAX_DISALLOWED_DOMAIN]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME: CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME = "CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME".asInstanceOf[CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE: CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE = "CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE".asInstanceOf[CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_MEDIA_TYPE
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_MEDIA_TYPE: CSS_SYNTAX_DISALLOWED_MEDIA_TYPE = "CSS_SYNTAX_DISALLOWED_MEDIA_TYPE".asInstanceOf[CSS_SYNTAX_DISALLOWED_MEDIA_TYPE]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE: CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE = "CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE".asInstanceOf[CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT: CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT = "CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT".asInstanceOf[CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME: CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME = "CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME".asInstanceOf[CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME]
  
  @js.native
  sealed trait CSS_SYNTAX_DISALLOWED_RELATIVE_URL
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_DISALLOWED_RELATIVE_URL: CSS_SYNTAX_DISALLOWED_RELATIVE_URL = "CSS_SYNTAX_DISALLOWED_RELATIVE_URL".asInstanceOf[CSS_SYNTAX_DISALLOWED_RELATIVE_URL]
  
  @js.native
  sealed trait CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE: CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE = "CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE".asInstanceOf[CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE]
  
  @js.native
  sealed trait CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR: CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR = "CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR".asInstanceOf[CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR]
  
  @js.native
  sealed trait CSS_SYNTAX_INCOMPLETE_DECLARATION
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INCOMPLETE_DECLARATION: CSS_SYNTAX_INCOMPLETE_DECLARATION = "CSS_SYNTAX_INCOMPLETE_DECLARATION".asInstanceOf[CSS_SYNTAX_INCOMPLETE_DECLARATION]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_ATTR_SELECTOR
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_ATTR_SELECTOR: CSS_SYNTAX_INVALID_ATTR_SELECTOR = "CSS_SYNTAX_INVALID_ATTR_SELECTOR".asInstanceOf[CSS_SYNTAX_INVALID_ATTR_SELECTOR]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_AT_RULE
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_AT_RULE: CSS_SYNTAX_INVALID_AT_RULE = "CSS_SYNTAX_INVALID_AT_RULE".asInstanceOf[CSS_SYNTAX_INVALID_AT_RULE]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_DECLARATION
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_DECLARATION: CSS_SYNTAX_INVALID_DECLARATION = "CSS_SYNTAX_INVALID_DECLARATION".asInstanceOf[CSS_SYNTAX_INVALID_DECLARATION]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_PROPERTY
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_PROPERTY: CSS_SYNTAX_INVALID_PROPERTY = "CSS_SYNTAX_INVALID_PROPERTY".asInstanceOf[CSS_SYNTAX_INVALID_PROPERTY]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_PROPERTY_NOLIST
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_PROPERTY_NOLIST: CSS_SYNTAX_INVALID_PROPERTY_NOLIST = "CSS_SYNTAX_INVALID_PROPERTY_NOLIST".asInstanceOf[CSS_SYNTAX_INVALID_PROPERTY_NOLIST]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_URL
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_URL: CSS_SYNTAX_INVALID_URL = "CSS_SYNTAX_INVALID_URL".asInstanceOf[CSS_SYNTAX_INVALID_URL]
  
  @js.native
  sealed trait CSS_SYNTAX_INVALID_URL_PROTOCOL
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_INVALID_URL_PROTOCOL: CSS_SYNTAX_INVALID_URL_PROTOCOL = "CSS_SYNTAX_INVALID_URL_PROTOCOL".asInstanceOf[CSS_SYNTAX_INVALID_URL_PROTOCOL]
  
  @js.native
  sealed trait CSS_SYNTAX_MALFORMED_MEDIA_QUERY
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_MALFORMED_MEDIA_QUERY: CSS_SYNTAX_MALFORMED_MEDIA_QUERY = "CSS_SYNTAX_MALFORMED_MEDIA_QUERY".asInstanceOf[CSS_SYNTAX_MALFORMED_MEDIA_QUERY]
  
  @js.native
  sealed trait CSS_SYNTAX_MISSING_SELECTOR
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_MISSING_SELECTOR: CSS_SYNTAX_MISSING_SELECTOR = "CSS_SYNTAX_MISSING_SELECTOR".asInstanceOf[CSS_SYNTAX_MISSING_SELECTOR]
  
  @js.native
  sealed trait CSS_SYNTAX_MISSING_URL
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_MISSING_URL: CSS_SYNTAX_MISSING_URL = "CSS_SYNTAX_MISSING_URL".asInstanceOf[CSS_SYNTAX_MISSING_URL]
  
  @js.native
  sealed trait CSS_SYNTAX_NOT_A_SELECTOR_START
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_NOT_A_SELECTOR_START: CSS_SYNTAX_NOT_A_SELECTOR_START = "CSS_SYNTAX_NOT_A_SELECTOR_START".asInstanceOf[CSS_SYNTAX_NOT_A_SELECTOR_START]
  
  @js.native
  sealed trait CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH: CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH = "CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH".asInstanceOf[CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH]
  
  @js.native
  sealed trait CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE: CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE = "CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE".asInstanceOf[CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE]
  
  @js.native
  sealed trait CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION: CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION = "CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION".asInstanceOf[CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION]
  
  @js.native
  sealed trait CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS: CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS = "CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS".asInstanceOf[CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS]
  
  @js.native
  sealed trait CSS_SYNTAX_STRAY_TRAILING_BACKSLASH
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_STRAY_TRAILING_BACKSLASH: CSS_SYNTAX_STRAY_TRAILING_BACKSLASH = "CSS_SYNTAX_STRAY_TRAILING_BACKSLASH".asInstanceOf[CSS_SYNTAX_STRAY_TRAILING_BACKSLASH]
  
  @js.native
  sealed trait CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR: CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR = "CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR".asInstanceOf[CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR]
  
  @js.native
  sealed trait CSS_SYNTAX_UNTERMINATED_COMMENT
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_UNTERMINATED_COMMENT: CSS_SYNTAX_UNTERMINATED_COMMENT = "CSS_SYNTAX_UNTERMINATED_COMMENT".asInstanceOf[CSS_SYNTAX_UNTERMINATED_COMMENT]
  
  @js.native
  sealed trait CSS_SYNTAX_UNTERMINATED_STRING
    extends StObject
       with ValidationErrorCode
  inline def CSS_SYNTAX_UNTERMINATED_STRING: CSS_SYNTAX_UNTERMINATED_STRING = "CSS_SYNTAX_UNTERMINATED_STRING".asInstanceOf[CSS_SYNTAX_UNTERMINATED_STRING]
  
  @js.native
  sealed trait DEPRECATED_ATTR
    extends StObject
       with ValidationErrorCode
  inline def DEPRECATED_ATTR: DEPRECATED_ATTR = "DEPRECATED_ATTR".asInstanceOf[DEPRECATED_ATTR]
  
  @js.native
  sealed trait DEPRECATED_TAG
    extends StObject
       with ValidationErrorCode
  inline def DEPRECATED_TAG: DEPRECATED_TAG = "DEPRECATED_TAG".asInstanceOf[DEPRECATED_TAG]
  
  @js.native
  sealed trait DEV_MODE_ONLY
    extends StObject
       with ValidationErrorCode
  inline def DEV_MODE_ONLY: DEV_MODE_ONLY = "DEV_MODE_ONLY".asInstanceOf[DEV_MODE_ONLY]
  
  @js.native
  sealed trait DISALLOWED_ATTR
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_ATTR: DISALLOWED_ATTR = "DISALLOWED_ATTR".asInstanceOf[DISALLOWED_ATTR]
  
  @js.native
  sealed trait DISALLOWED_CHILD_TAG_NAME
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_CHILD_TAG_NAME: DISALLOWED_CHILD_TAG_NAME = "DISALLOWED_CHILD_TAG_NAME".asInstanceOf[DISALLOWED_CHILD_TAG_NAME]
  
  @js.native
  sealed trait DISALLOWED_DOMAIN
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_DOMAIN: DISALLOWED_DOMAIN = "DISALLOWED_DOMAIN".asInstanceOf[DISALLOWED_DOMAIN]
  
  @js.native
  sealed trait DISALLOWED_FIRST_CHILD_TAG_NAME
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_FIRST_CHILD_TAG_NAME: DISALLOWED_FIRST_CHILD_TAG_NAME = "DISALLOWED_FIRST_CHILD_TAG_NAME".asInstanceOf[DISALLOWED_FIRST_CHILD_TAG_NAME]
  
  @js.native
  sealed trait DISALLOWED_MANUFACTURED_BODY
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_MANUFACTURED_BODY: DISALLOWED_MANUFACTURED_BODY = "DISALLOWED_MANUFACTURED_BODY".asInstanceOf[DISALLOWED_MANUFACTURED_BODY]
  
  @js.native
  sealed trait DISALLOWED_PROPERTY_IN_ATTR_VALUE
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_PROPERTY_IN_ATTR_VALUE: DISALLOWED_PROPERTY_IN_ATTR_VALUE = "DISALLOWED_PROPERTY_IN_ATTR_VALUE".asInstanceOf[DISALLOWED_PROPERTY_IN_ATTR_VALUE]
  
  @js.native
  sealed trait DISALLOWED_RELATIVE_URL
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_RELATIVE_URL: DISALLOWED_RELATIVE_URL = "DISALLOWED_RELATIVE_URL".asInstanceOf[DISALLOWED_RELATIVE_URL]
  
  @js.native
  sealed trait DISALLOWED_SCRIPT_TAG
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_SCRIPT_TAG: DISALLOWED_SCRIPT_TAG = "DISALLOWED_SCRIPT_TAG".asInstanceOf[DISALLOWED_SCRIPT_TAG]
  
  @js.native
  sealed trait DISALLOWED_STYLE_ATTR
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_STYLE_ATTR: DISALLOWED_STYLE_ATTR = "DISALLOWED_STYLE_ATTR".asInstanceOf[DISALLOWED_STYLE_ATTR]
  
  @js.native
  sealed trait DISALLOWED_TAG
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_TAG: DISALLOWED_TAG = "DISALLOWED_TAG".asInstanceOf[DISALLOWED_TAG]
  
  @js.native
  sealed trait DISALLOWED_TAG_ANCESTOR
    extends StObject
       with ValidationErrorCode
  inline def DISALLOWED_TAG_ANCESTOR: DISALLOWED_TAG_ANCESTOR = "DISALLOWED_TAG_ANCESTOR".asInstanceOf[DISALLOWED_TAG_ANCESTOR]
  
  @js.native
  sealed trait DOCUMENT_SIZE_LIMIT_EXCEEDED
    extends StObject
       with ValidationErrorCode
  inline def DOCUMENT_SIZE_LIMIT_EXCEEDED: DOCUMENT_SIZE_LIMIT_EXCEEDED = "DOCUMENT_SIZE_LIMIT_EXCEEDED".asInstanceOf[DOCUMENT_SIZE_LIMIT_EXCEEDED]
  
  @js.native
  sealed trait DOCUMENT_TOO_COMPLEX
    extends StObject
       with ValidationErrorCode
  inline def DOCUMENT_TOO_COMPLEX: DOCUMENT_TOO_COMPLEX = "DOCUMENT_TOO_COMPLEX".asInstanceOf[DOCUMENT_TOO_COMPLEX]
  
  @js.native
  sealed trait DUPLICATE_ATTRIBUTE
    extends StObject
       with ValidationErrorCode
  inline def DUPLICATE_ATTRIBUTE: DUPLICATE_ATTRIBUTE = "DUPLICATE_ATTRIBUTE".asInstanceOf[DUPLICATE_ATTRIBUTE]
  
  @js.native
  sealed trait DUPLICATE_DIMENSION
    extends StObject
       with ValidationErrorCode
  inline def DUPLICATE_DIMENSION: DUPLICATE_DIMENSION = "DUPLICATE_DIMENSION".asInstanceOf[DUPLICATE_DIMENSION]
  
  @js.native
  sealed trait DUPLICATE_REFERENCE_POINT
    extends StObject
       with ValidationErrorCode
  inline def DUPLICATE_REFERENCE_POINT: DUPLICATE_REFERENCE_POINT = "DUPLICATE_REFERENCE_POINT".asInstanceOf[DUPLICATE_REFERENCE_POINT]
  
  @js.native
  sealed trait DUPLICATE_UNIQUE_TAG
    extends StObject
       with ValidationErrorCode
  inline def DUPLICATE_UNIQUE_TAG: DUPLICATE_UNIQUE_TAG = "DUPLICATE_UNIQUE_TAG".asInstanceOf[DUPLICATE_UNIQUE_TAG]
  
  @js.native
  sealed trait DUPLICATE_UNIQUE_TAG_WARNING
    extends StObject
       with ValidationErrorCode
  inline def DUPLICATE_UNIQUE_TAG_WARNING: DUPLICATE_UNIQUE_TAG_WARNING = "DUPLICATE_UNIQUE_TAG_WARNING".asInstanceOf[DUPLICATE_UNIQUE_TAG_WARNING]
  
  @js.native
  sealed trait ERROR
    extends StObject
       with ValidationErrorSeverity
  inline def ERROR: ERROR = "ERROR".asInstanceOf[ERROR]
  
  @js.native
  sealed trait EXTENSION_UNUSED
    extends StObject
       with ValidationErrorCode
  inline def EXTENSION_UNUSED: EXTENSION_UNUSED = "EXTENSION_UNUSED".asInstanceOf[EXTENSION_UNUSED]
  
  @js.native
  sealed trait FAIL
    extends StObject
       with ValidationResultStatus
  inline def FAIL: FAIL = "FAIL".asInstanceOf[FAIL]
  
  @js.native
  sealed trait GENERAL_DISALLOWED_TAG
    extends StObject
       with ValidationErrorCode
  inline def GENERAL_DISALLOWED_TAG: GENERAL_DISALLOWED_TAG = "GENERAL_DISALLOWED_TAG".asInstanceOf[GENERAL_DISALLOWED_TAG]
  
  @js.native
  sealed trait IMPLIED_LAYOUT_INVALID
    extends StObject
       with ValidationErrorCode
  inline def IMPLIED_LAYOUT_INVALID: IMPLIED_LAYOUT_INVALID = "IMPLIED_LAYOUT_INVALID".asInstanceOf[IMPLIED_LAYOUT_INVALID]
  
  @js.native
  sealed trait INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT
    extends StObject
       with ValidationErrorCode
  inline def INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT: INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT = "INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT".asInstanceOf[INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT]
  
  @js.native
  sealed trait INCORRECT_MIN_NUM_CHILD_TAGS
    extends StObject
       with ValidationErrorCode
  inline def INCORRECT_MIN_NUM_CHILD_TAGS: INCORRECT_MIN_NUM_CHILD_TAGS = "INCORRECT_MIN_NUM_CHILD_TAGS".asInstanceOf[INCORRECT_MIN_NUM_CHILD_TAGS]
  
  @js.native
  sealed trait INCORRECT_NUM_CHILD_TAGS
    extends StObject
       with ValidationErrorCode
  inline def INCORRECT_NUM_CHILD_TAGS: INCORRECT_NUM_CHILD_TAGS = "INCORRECT_NUM_CHILD_TAGS".asInstanceOf[INCORRECT_NUM_CHILD_TAGS]
  
  @js.native
  sealed trait INLINE_STYLE_TOO_LONG
    extends StObject
       with ValidationErrorCode
  inline def INLINE_STYLE_TOO_LONG: INLINE_STYLE_TOO_LONG = "INLINE_STYLE_TOO_LONG".asInstanceOf[INLINE_STYLE_TOO_LONG]
  
  @js.native
  sealed trait INVALID_ATTR_VALUE
    extends StObject
       with ValidationErrorCode
  inline def INVALID_ATTR_VALUE: INVALID_ATTR_VALUE = "INVALID_ATTR_VALUE".asInstanceOf[INVALID_ATTR_VALUE]
  
  @js.native
  sealed trait INVALID_JSON_CDATA
    extends StObject
       with ValidationErrorCode
  inline def INVALID_JSON_CDATA: INVALID_JSON_CDATA = "INVALID_JSON_CDATA".asInstanceOf[INVALID_JSON_CDATA]
  
  @js.native
  sealed trait INVALID_PROPERTY_VALUE_IN_ATTR_VALUE
    extends StObject
       with ValidationErrorCode
  inline def INVALID_PROPERTY_VALUE_IN_ATTR_VALUE: INVALID_PROPERTY_VALUE_IN_ATTR_VALUE = "INVALID_PROPERTY_VALUE_IN_ATTR_VALUE".asInstanceOf[INVALID_PROPERTY_VALUE_IN_ATTR_VALUE]
  
  @js.native
  sealed trait INVALID_URL
    extends StObject
       with ValidationErrorCode
  inline def INVALID_URL: INVALID_URL = "INVALID_URL".asInstanceOf[INVALID_URL]
  
  @js.native
  sealed trait INVALID_URL_PROTOCOL
    extends StObject
       with ValidationErrorCode
  inline def INVALID_URL_PROTOCOL: INVALID_URL_PROTOCOL = "INVALID_URL_PROTOCOL".asInstanceOf[INVALID_URL_PROTOCOL]
  
  @js.native
  sealed trait INVALID_UTF8
    extends StObject
       with ValidationErrorCode
  inline def INVALID_UTF8: INVALID_UTF8 = "INVALID_UTF8".asInstanceOf[INVALID_UTF8]
  
  @js.native
  sealed trait MANDATORY_ANYOF_ATTR_MISSING
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_ANYOF_ATTR_MISSING: MANDATORY_ANYOF_ATTR_MISSING = "MANDATORY_ANYOF_ATTR_MISSING".asInstanceOf[MANDATORY_ANYOF_ATTR_MISSING]
  
  @js.native
  sealed trait MANDATORY_ATTR_MISSING
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_ATTR_MISSING: MANDATORY_ATTR_MISSING = "MANDATORY_ATTR_MISSING".asInstanceOf[MANDATORY_ATTR_MISSING]
  
  @js.native
  sealed trait MANDATORY_CDATA_MISSING_OR_INCORRECT
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_CDATA_MISSING_OR_INCORRECT: MANDATORY_CDATA_MISSING_OR_INCORRECT = "MANDATORY_CDATA_MISSING_OR_INCORRECT".asInstanceOf[MANDATORY_CDATA_MISSING_OR_INCORRECT]
  
  @js.native
  sealed trait MANDATORY_LAST_CHILD_TAG
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_LAST_CHILD_TAG: MANDATORY_LAST_CHILD_TAG = "MANDATORY_LAST_CHILD_TAG".asInstanceOf[MANDATORY_LAST_CHILD_TAG]
  
  @js.native
  sealed trait MANDATORY_ONEOF_ATTR_MISSING
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_ONEOF_ATTR_MISSING: MANDATORY_ONEOF_ATTR_MISSING = "MANDATORY_ONEOF_ATTR_MISSING".asInstanceOf[MANDATORY_ONEOF_ATTR_MISSING]
  
  @js.native
  sealed trait MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE: MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE = "MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE".asInstanceOf[MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE]
  
  @js.native
  sealed trait MANDATORY_REFERENCE_POINT_MISSING
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_REFERENCE_POINT_MISSING: MANDATORY_REFERENCE_POINT_MISSING = "MANDATORY_REFERENCE_POINT_MISSING".asInstanceOf[MANDATORY_REFERENCE_POINT_MISSING]
  
  @js.native
  sealed trait MANDATORY_TAG_ANCESTOR
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_TAG_ANCESTOR: MANDATORY_TAG_ANCESTOR = "MANDATORY_TAG_ANCESTOR".asInstanceOf[MANDATORY_TAG_ANCESTOR]
  
  @js.native
  sealed trait MANDATORY_TAG_ANCESTOR_WITH_HINT
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_TAG_ANCESTOR_WITH_HINT: MANDATORY_TAG_ANCESTOR_WITH_HINT = "MANDATORY_TAG_ANCESTOR_WITH_HINT".asInstanceOf[MANDATORY_TAG_ANCESTOR_WITH_HINT]
  
  @js.native
  sealed trait MANDATORY_TAG_MISSING
    extends StObject
       with ValidationErrorCode
  inline def MANDATORY_TAG_MISSING: MANDATORY_TAG_MISSING = "MANDATORY_TAG_MISSING".asInstanceOf[MANDATORY_TAG_MISSING]
  
  @js.native
  sealed trait MISSING_LAYOUT_ATTRIBUTES
    extends StObject
       with ValidationErrorCode
  inline def MISSING_LAYOUT_ATTRIBUTES: MISSING_LAYOUT_ATTRIBUTES = "MISSING_LAYOUT_ATTRIBUTES".asInstanceOf[MISSING_LAYOUT_ATTRIBUTES]
  
  @js.native
  sealed trait MISSING_REQUIRED_EXTENSION
    extends StObject
       with ValidationErrorCode
  inline def MISSING_REQUIRED_EXTENSION: MISSING_REQUIRED_EXTENSION = "MISSING_REQUIRED_EXTENSION".asInstanceOf[MISSING_REQUIRED_EXTENSION]
  
  @js.native
  sealed trait MISSING_URL
    extends StObject
       with ValidationErrorCode
  inline def MISSING_URL: MISSING_URL = "MISSING_URL".asInstanceOf[MISSING_URL]
  
  @js.native
  sealed trait MUTUALLY_EXCLUSIVE_ATTRS
    extends StObject
       with ValidationErrorCode
  inline def MUTUALLY_EXCLUSIVE_ATTRS: MUTUALLY_EXCLUSIVE_ATTRS = "MUTUALLY_EXCLUSIVE_ATTRS".asInstanceOf[MUTUALLY_EXCLUSIVE_ATTRS]
  
  @js.native
  sealed trait NON_WHITESPACE_CDATA_ENCOUNTERED
    extends StObject
       with ValidationErrorCode
  inline def NON_WHITESPACE_CDATA_ENCOUNTERED: NON_WHITESPACE_CDATA_ENCOUNTERED = "NON_WHITESPACE_CDATA_ENCOUNTERED".asInstanceOf[NON_WHITESPACE_CDATA_ENCOUNTERED]
  
  @js.native
  sealed trait PASS
    extends StObject
       with ValidationResultStatus
  inline def PASS: PASS = "PASS".asInstanceOf[PASS]
  
  @js.native
  sealed trait SPECIFIED_LAYOUT_INVALID
    extends StObject
       with ValidationErrorCode
  inline def SPECIFIED_LAYOUT_INVALID: SPECIFIED_LAYOUT_INVALID = "SPECIFIED_LAYOUT_INVALID".asInstanceOf[SPECIFIED_LAYOUT_INVALID]
  
  @js.native
  sealed trait STYLESHEET_AND_INLINE_STYLE_TOO_LONG
    extends StObject
       with ValidationErrorCode
  inline def STYLESHEET_AND_INLINE_STYLE_TOO_LONG: STYLESHEET_AND_INLINE_STYLE_TOO_LONG = "STYLESHEET_AND_INLINE_STYLE_TOO_LONG".asInstanceOf[STYLESHEET_AND_INLINE_STYLE_TOO_LONG]
  
  @js.native
  sealed trait STYLESHEET_TOO_LONG
    extends StObject
       with ValidationErrorCode
  inline def STYLESHEET_TOO_LONG: STYLESHEET_TOO_LONG = "STYLESHEET_TOO_LONG".asInstanceOf[STYLESHEET_TOO_LONG]
  
  @js.native
  sealed trait TAG_EXCLUDED_BY_TAG
    extends StObject
       with ValidationErrorCode
  inline def TAG_EXCLUDED_BY_TAG: TAG_EXCLUDED_BY_TAG = "TAG_EXCLUDED_BY_TAG".asInstanceOf[TAG_EXCLUDED_BY_TAG]
  
  @js.native
  sealed trait TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS
    extends StObject
       with ValidationErrorCode
  inline def TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS: TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS = "TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS".asInstanceOf[TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS]
  
  @js.native
  sealed trait TAG_REFERENCE_POINT_CONFLICT
    extends StObject
       with ValidationErrorCode
  inline def TAG_REFERENCE_POINT_CONFLICT: TAG_REFERENCE_POINT_CONFLICT = "TAG_REFERENCE_POINT_CONFLICT".asInstanceOf[TAG_REFERENCE_POINT_CONFLICT]
  
  @js.native
  sealed trait TAG_REQUIRED_BY_MISSING
    extends StObject
       with ValidationErrorCode
  inline def TAG_REQUIRED_BY_MISSING: TAG_REQUIRED_BY_MISSING = "TAG_REQUIRED_BY_MISSING".asInstanceOf[TAG_REQUIRED_BY_MISSING]
  
  @js.native
  sealed trait TEMPLATE_IN_ATTR_NAME
    extends StObject
       with ValidationErrorCode
  inline def TEMPLATE_IN_ATTR_NAME: TEMPLATE_IN_ATTR_NAME = "TEMPLATE_IN_ATTR_NAME".asInstanceOf[TEMPLATE_IN_ATTR_NAME]
  
  @js.native
  sealed trait TEMPLATE_PARTIAL_IN_ATTR_VALUE
    extends StObject
       with ValidationErrorCode
  inline def TEMPLATE_PARTIAL_IN_ATTR_VALUE: TEMPLATE_PARTIAL_IN_ATTR_VALUE = "TEMPLATE_PARTIAL_IN_ATTR_VALUE".asInstanceOf[TEMPLATE_PARTIAL_IN_ATTR_VALUE]
  
  @js.native
  sealed trait UNESCAPED_TEMPLATE_IN_ATTR_VALUE
    extends StObject
       with ValidationErrorCode
  inline def UNESCAPED_TEMPLATE_IN_ATTR_VALUE: UNESCAPED_TEMPLATE_IN_ATTR_VALUE = "UNESCAPED_TEMPLATE_IN_ATTR_VALUE".asInstanceOf[UNESCAPED_TEMPLATE_IN_ATTR_VALUE]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ValidationResultStatus
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait UNKNOWN_CODE
    extends StObject
       with ValidationErrorCode
  inline def UNKNOWN_CODE: UNKNOWN_CODE = "UNKNOWN_CODE".asInstanceOf[UNKNOWN_CODE]
  
  @js.native
  sealed trait UNKNOWN_SEVERITY
    extends StObject
       with ValidationErrorSeverity
  inline def UNKNOWN_SEVERITY: UNKNOWN_SEVERITY = "UNKNOWN_SEVERITY".asInstanceOf[UNKNOWN_SEVERITY]
  
  @js.native
  sealed trait VALUE_SET_MISMATCH
    extends StObject
       with ValidationErrorCode
  inline def VALUE_SET_MISMATCH: VALUE_SET_MISMATCH = "VALUE_SET_MISMATCH".asInstanceOf[VALUE_SET_MISMATCH]
  
  @js.native
  sealed trait WARNING
    extends StObject
       with ValidationErrorSeverity
  inline def WARNING: WARNING = "WARNING".asInstanceOf[WARNING]
  
  @js.native
  sealed trait WARNING_EXTENSION_DEPRECATED_VERSION
    extends StObject
       with ValidationErrorCode
  inline def WARNING_EXTENSION_DEPRECATED_VERSION: WARNING_EXTENSION_DEPRECATED_VERSION = "WARNING_EXTENSION_DEPRECATED_VERSION".asInstanceOf[WARNING_EXTENSION_DEPRECATED_VERSION]
  
  @js.native
  sealed trait WARNING_EXTENSION_UNUSED
    extends StObject
       with ValidationErrorCode
  inline def WARNING_EXTENSION_UNUSED: WARNING_EXTENSION_UNUSED = "WARNING_EXTENSION_UNUSED".asInstanceOf[WARNING_EXTENSION_UNUSED]
  
  @js.native
  sealed trait WARNING_TAG_REQUIRED_BY_MISSING
    extends StObject
       with ValidationErrorCode
  inline def WARNING_TAG_REQUIRED_BY_MISSING: WARNING_TAG_REQUIRED_BY_MISSING = "WARNING_TAG_REQUIRED_BY_MISSING".asInstanceOf[WARNING_TAG_REQUIRED_BY_MISSING]
  
  @js.native
  sealed trait WRONG_PARENT_TAG
    extends StObject
       with ValidationErrorCode
  inline def WRONG_PARENT_TAG: WRONG_PARENT_TAG = "WRONG_PARENT_TAG".asInstanceOf[WRONG_PARENT_TAG]
}
