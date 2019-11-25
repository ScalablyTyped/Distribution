package typings.amphtmlDashValidator.amphtmlDashValidatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNKNOWN_CODE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_TAG_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TAG_REQUIRED_BY_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING_EXTENSION_UNUSED
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.EXTENSION_UNUSED
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_REQUIRED_BUT_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.GENERAL_DISALLOWED_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_SCRIPT_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_ATTR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_STYLE_ATTR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_ATTR_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_ATTRIBUTE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.IMPLIED_LAYOUT_INVALID
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.SPECIFIED_LAYOUT_INVALID
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_ATTR_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_DIMENSION
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_UNIQUE_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WRONG_PARENT_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.STYLESHEET_TOO_LONG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CDATA_VIOLATES_BLACKLIST
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DEPRECATED_ATTR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DEPRECATED_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MISSING_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_URL_PROTOCOL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_DOMAIN
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_RELATIVE_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TEMPLATE_IN_ATTR_NAME
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_TAG_ANCESTOR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_LAST_CHILD_TAG
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_TAG_ANCESTOR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INCORRECT_NUM_CHILD_TAGS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_CHILD_TAG_NAME
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_MANUFACTURED_BODY
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_REFERENCE_POINT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TAG_REFERENCE_POINT_CONFLICT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MISSING_REQUIRED_EXTENSION
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DOCUMENT_TOO_COMPLEX
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_UTF8
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_BAD_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_MISSING_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH
  - typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION
*/
trait ValidationErrorCode extends js.Object

object ValidationErrorCode {
  @scala.inline
  def ATTR_DISALLOWED_BY_IMPLIED_LAYOUT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT = this.cast("ATTR_DISALLOWED_BY_IMPLIED_LAYOUT")
  @scala.inline
  def ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT = this.cast("ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT")
  @scala.inline
  def ATTR_MISSING_REQUIRED_EXTENSION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION = this.cast("ATTR_MISSING_REQUIRED_EXTENSION")
  @scala.inline
  def ATTR_REQUIRED_BUT_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_REQUIRED_BUT_MISSING = this.cast("ATTR_REQUIRED_BUT_MISSING")
  @scala.inline
  def ATTR_VALUE_REQUIRED_BY_LAYOUT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT = this.cast("ATTR_VALUE_REQUIRED_BY_LAYOUT")
  @scala.inline
  def BASE_TAG_MUST_PRECEED_ALL_URLS: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS = this.cast("BASE_TAG_MUST_PRECEED_ALL_URLS")
  @scala.inline
  def CDATA_VIOLATES_BLACKLIST: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CDATA_VIOLATES_BLACKLIST = this.cast("CDATA_VIOLATES_BLACKLIST")
  @scala.inline
  def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT = this.cast("CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT")
  @scala.inline
  def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR = this.cast("CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR")
  @scala.inline
  def CSS_SYNTAX: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX = this.cast("CSS_SYNTAX")
  @scala.inline
  def CSS_SYNTAX_BAD_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_BAD_URL = this.cast("CSS_SYNTAX_BAD_URL")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_DOMAIN: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN = this.cast("CSS_SYNTAX_DISALLOWED_DOMAIN")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME = this.cast("CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE = this.cast("CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_MEDIA_TYPE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE = this.cast("CSS_SYNTAX_DISALLOWED_MEDIA_TYPE")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE = this.cast("CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT = this.cast("CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME = this.cast("CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME")
  @scala.inline
  def CSS_SYNTAX_DISALLOWED_RELATIVE_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL = this.cast("CSS_SYNTAX_DISALLOWED_RELATIVE_URL")
  @scala.inline
  def CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE = this.cast("CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE")
  @scala.inline
  def CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR = this.cast("CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR")
  @scala.inline
  def CSS_SYNTAX_INCOMPLETE_DECLARATION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION = this.cast("CSS_SYNTAX_INCOMPLETE_DECLARATION")
  @scala.inline
  def CSS_SYNTAX_INVALID_ATTR_SELECTOR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR = this.cast("CSS_SYNTAX_INVALID_ATTR_SELECTOR")
  @scala.inline
  def CSS_SYNTAX_INVALID_AT_RULE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE = this.cast("CSS_SYNTAX_INVALID_AT_RULE")
  @scala.inline
  def CSS_SYNTAX_INVALID_DECLARATION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION = this.cast("CSS_SYNTAX_INVALID_DECLARATION")
  @scala.inline
  def CSS_SYNTAX_INVALID_PROPERTY: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY = this.cast("CSS_SYNTAX_INVALID_PROPERTY")
  @scala.inline
  def CSS_SYNTAX_INVALID_PROPERTY_NOLIST: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST = this.cast("CSS_SYNTAX_INVALID_PROPERTY_NOLIST")
  @scala.inline
  def CSS_SYNTAX_INVALID_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_URL = this.cast("CSS_SYNTAX_INVALID_URL")
  @scala.inline
  def CSS_SYNTAX_INVALID_URL_PROTOCOL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL = this.cast("CSS_SYNTAX_INVALID_URL_PROTOCOL")
  @scala.inline
  def CSS_SYNTAX_MALFORMED_MEDIA_QUERY: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY = this.cast("CSS_SYNTAX_MALFORMED_MEDIA_QUERY")
  @scala.inline
  def CSS_SYNTAX_MISSING_SELECTOR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR = this.cast("CSS_SYNTAX_MISSING_SELECTOR")
  @scala.inline
  def CSS_SYNTAX_MISSING_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_MISSING_URL = this.cast("CSS_SYNTAX_MISSING_URL")
  @scala.inline
  def CSS_SYNTAX_NOT_A_SELECTOR_START: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START = this.cast("CSS_SYNTAX_NOT_A_SELECTOR_START")
  @scala.inline
  def CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH = this.cast("CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH")
  @scala.inline
  def CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE = this.cast("CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE")
  @scala.inline
  def CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION = this.cast("CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION")
  @scala.inline
  def CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS = this.cast("CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS")
  @scala.inline
  def CSS_SYNTAX_STRAY_TRAILING_BACKSLASH: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH = this.cast("CSS_SYNTAX_STRAY_TRAILING_BACKSLASH")
  @scala.inline
  def CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR = this.cast("CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR")
  @scala.inline
  def CSS_SYNTAX_UNTERMINATED_COMMENT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT = this.cast("CSS_SYNTAX_UNTERMINATED_COMMENT")
  @scala.inline
  def CSS_SYNTAX_UNTERMINATED_STRING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING = this.cast("CSS_SYNTAX_UNTERMINATED_STRING")
  @scala.inline
  def DEPRECATED_ATTR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DEPRECATED_ATTR = this.cast("DEPRECATED_ATTR")
  @scala.inline
  def DEPRECATED_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DEPRECATED_TAG = this.cast("DEPRECATED_TAG")
  @scala.inline
  def DISALLOWED_ATTR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_ATTR = this.cast("DISALLOWED_ATTR")
  @scala.inline
  def DISALLOWED_CHILD_TAG_NAME: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_CHILD_TAG_NAME = this.cast("DISALLOWED_CHILD_TAG_NAME")
  @scala.inline
  def DISALLOWED_DOMAIN: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_DOMAIN = this.cast("DISALLOWED_DOMAIN")
  @scala.inline
  def DISALLOWED_FIRST_CHILD_TAG_NAME: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME = this.cast("DISALLOWED_FIRST_CHILD_TAG_NAME")
  @scala.inline
  def DISALLOWED_MANUFACTURED_BODY: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_MANUFACTURED_BODY = this.cast("DISALLOWED_MANUFACTURED_BODY")
  @scala.inline
  def DISALLOWED_PROPERTY_IN_ATTR_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE = this.cast("DISALLOWED_PROPERTY_IN_ATTR_VALUE")
  @scala.inline
  def DISALLOWED_RELATIVE_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_RELATIVE_URL = this.cast("DISALLOWED_RELATIVE_URL")
  @scala.inline
  def DISALLOWED_SCRIPT_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_SCRIPT_TAG = this.cast("DISALLOWED_SCRIPT_TAG")
  @scala.inline
  def DISALLOWED_STYLE_ATTR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_STYLE_ATTR = this.cast("DISALLOWED_STYLE_ATTR")
  @scala.inline
  def DISALLOWED_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_TAG = this.cast("DISALLOWED_TAG")
  @scala.inline
  def DISALLOWED_TAG_ANCESTOR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DISALLOWED_TAG_ANCESTOR = this.cast("DISALLOWED_TAG_ANCESTOR")
  @scala.inline
  def DOCUMENT_TOO_COMPLEX: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DOCUMENT_TOO_COMPLEX = this.cast("DOCUMENT_TOO_COMPLEX")
  @scala.inline
  def DUPLICATE_ATTRIBUTE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_ATTRIBUTE = this.cast("DUPLICATE_ATTRIBUTE")
  @scala.inline
  def DUPLICATE_DIMENSION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_DIMENSION = this.cast("DUPLICATE_DIMENSION")
  @scala.inline
  def DUPLICATE_REFERENCE_POINT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_REFERENCE_POINT = this.cast("DUPLICATE_REFERENCE_POINT")
  @scala.inline
  def DUPLICATE_UNIQUE_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_UNIQUE_TAG = this.cast("DUPLICATE_UNIQUE_TAG")
  @scala.inline
  def DUPLICATE_UNIQUE_TAG_WARNING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING = this.cast("DUPLICATE_UNIQUE_TAG_WARNING")
  @scala.inline
  def EXTENSION_UNUSED: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.EXTENSION_UNUSED = this.cast("EXTENSION_UNUSED")
  @scala.inline
  def GENERAL_DISALLOWED_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.GENERAL_DISALLOWED_TAG = this.cast("GENERAL_DISALLOWED_TAG")
  @scala.inline
  def IMPLIED_LAYOUT_INVALID: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.IMPLIED_LAYOUT_INVALID = this.cast("IMPLIED_LAYOUT_INVALID")
  @scala.inline
  def INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT = this.cast("INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT")
  @scala.inline
  def INCORRECT_MIN_NUM_CHILD_TAGS: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS = this.cast("INCORRECT_MIN_NUM_CHILD_TAGS")
  @scala.inline
  def INCORRECT_NUM_CHILD_TAGS: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INCORRECT_NUM_CHILD_TAGS = this.cast("INCORRECT_NUM_CHILD_TAGS")
  @scala.inline
  def INVALID_ATTR_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_ATTR_VALUE = this.cast("INVALID_ATTR_VALUE")
  @scala.inline
  def INVALID_PROPERTY_VALUE_IN_ATTR_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE = this.cast("INVALID_PROPERTY_VALUE_IN_ATTR_VALUE")
  @scala.inline
  def INVALID_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_URL = this.cast("INVALID_URL")
  @scala.inline
  def INVALID_URL_PROTOCOL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_URL_PROTOCOL = this.cast("INVALID_URL_PROTOCOL")
  @scala.inline
  def INVALID_UTF8: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.INVALID_UTF8 = this.cast("INVALID_UTF8")
  @scala.inline
  def MANDATORY_ATTR_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_ATTR_MISSING = this.cast("MANDATORY_ATTR_MISSING")
  @scala.inline
  def MANDATORY_CDATA_MISSING_OR_INCORRECT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT = this.cast("MANDATORY_CDATA_MISSING_OR_INCORRECT")
  @scala.inline
  def MANDATORY_LAST_CHILD_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_LAST_CHILD_TAG = this.cast("MANDATORY_LAST_CHILD_TAG")
  @scala.inline
  def MANDATORY_ONEOF_ATTR_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING = this.cast("MANDATORY_ONEOF_ATTR_MISSING")
  @scala.inline
  def MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE = this.cast("MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE")
  @scala.inline
  def MANDATORY_REFERENCE_POINT_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING = this.cast("MANDATORY_REFERENCE_POINT_MISSING")
  @scala.inline
  def MANDATORY_TAG_ANCESTOR: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_TAG_ANCESTOR = this.cast("MANDATORY_TAG_ANCESTOR")
  @scala.inline
  def MANDATORY_TAG_ANCESTOR_WITH_HINT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT = this.cast("MANDATORY_TAG_ANCESTOR_WITH_HINT")
  @scala.inline
  def MANDATORY_TAG_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MANDATORY_TAG_MISSING = this.cast("MANDATORY_TAG_MISSING")
  @scala.inline
  def MISSING_REQUIRED_EXTENSION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MISSING_REQUIRED_EXTENSION = this.cast("MISSING_REQUIRED_EXTENSION")
  @scala.inline
  def MISSING_URL: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MISSING_URL = this.cast("MISSING_URL")
  @scala.inline
  def MUTUALLY_EXCLUSIVE_ATTRS: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS = this.cast("MUTUALLY_EXCLUSIVE_ATTRS")
  @scala.inline
  def NON_WHITESPACE_CDATA_ENCOUNTERED: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED = this.cast("NON_WHITESPACE_CDATA_ENCOUNTERED")
  @scala.inline
  def SPECIFIED_LAYOUT_INVALID: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.SPECIFIED_LAYOUT_INVALID = this.cast("SPECIFIED_LAYOUT_INVALID")
  @scala.inline
  def STYLESHEET_TOO_LONG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.STYLESHEET_TOO_LONG = this.cast("STYLESHEET_TOO_LONG")
  @scala.inline
  def TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS = this.cast("TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS")
  @scala.inline
  def TAG_REFERENCE_POINT_CONFLICT: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TAG_REFERENCE_POINT_CONFLICT = this.cast("TAG_REFERENCE_POINT_CONFLICT")
  @scala.inline
  def TAG_REQUIRED_BY_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TAG_REQUIRED_BY_MISSING = this.cast("TAG_REQUIRED_BY_MISSING")
  @scala.inline
  def TEMPLATE_IN_ATTR_NAME: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TEMPLATE_IN_ATTR_NAME = this.cast("TEMPLATE_IN_ATTR_NAME")
  @scala.inline
  def TEMPLATE_PARTIAL_IN_ATTR_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE = this.cast("TEMPLATE_PARTIAL_IN_ATTR_VALUE")
  @scala.inline
  def UNESCAPED_TEMPLATE_IN_ATTR_VALUE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE = this.cast("UNESCAPED_TEMPLATE_IN_ATTR_VALUE")
  @scala.inline
  def UNKNOWN_CODE: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.UNKNOWN_CODE = this.cast("UNKNOWN_CODE")
  @scala.inline
  def WARNING_EXTENSION_DEPRECATED_VERSION: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION = this.cast("WARNING_EXTENSION_DEPRECATED_VERSION")
  @scala.inline
  def WARNING_EXTENSION_UNUSED: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING_EXTENSION_UNUSED = this.cast("WARNING_EXTENSION_UNUSED")
  @scala.inline
  def WARNING_TAG_REQUIRED_BY_MISSING: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING = this.cast("WARNING_TAG_REQUIRED_BY_MISSING")
  @scala.inline
  def WRONG_PARENT_TAG: typings.amphtmlDashValidator.amphtmlDashValidatorStrings.WRONG_PARENT_TAG = this.cast("WRONG_PARENT_TAG")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

