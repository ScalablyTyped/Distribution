package typings.amphtmlValidator

import typings.node.vmMod.Context
import typings.node.vmMod.Script
import typings.node.vmMod.ScriptOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("amphtml-validator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("amphtml-validator", "Validator")
  @js.native
  open class Validator protected () extends Script {
    def this(code: String) = this()
    def this(code: String, options: String) = this()
    def this(code: String, options: ScriptOptions) = this()
    
    var sandbox: Context = js.native
    
    def validateString(stringToValidate: String): ValidationResult = js.native
    def validateString(stringToValidate: String, htmlFormat: String): ValidationResult = js.native
  }
  
  inline def getInstance(): js.Promise[Validator] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[js.Promise[Validator]]
  inline def getInstance(validatorJs: String): js.Promise[Validator] = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(validatorJs.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Validator]]
  inline def getInstance(validatorJs: String, userAgent: String): js.Promise[Validator] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(validatorJs.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Validator]]
  inline def getInstance(validatorJs: Unit, userAgent: String): js.Promise[Validator] = (^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")(validatorJs.asInstanceOf[js.Any], userAgent.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Validator]]
  
  inline def newInstance(validatorJsContents: String): Validator = ^.asInstanceOf[js.Dynamic].applyDynamic("newInstance")(validatorJsContents.asInstanceOf[js.Any]).asInstanceOf[Validator]
  
  trait ValidationError extends StObject {
    
    var code: ValidationErrorCode
    
    var col: Double
    
    var line: Double
    
    var message: String
    
    var params: js.Array[String]
    
    var severity: ValidationErrorSeverity
    
    var specUrl: String | Null
  }
  object ValidationError {
    
    inline def apply(
      code: ValidationErrorCode,
      col: Double,
      line: Double,
      message: String,
      params: js.Array[String],
      severity: ValidationErrorSeverity
    ): ValidationError = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], col = col.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], specUrl = null)
      __obj.asInstanceOf[ValidationError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationError] (val x: Self) extends AnyVal {
      
      inline def setCode(value: ValidationErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Array[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: String*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setSeverity(value: ValidationErrorSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSpecUrl(value: String): Self = StObject.set(x, "specUrl", value.asInstanceOf[js.Any])
      
      inline def setSpecUrlNull: Self = StObject.set(x, "specUrl", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_CODE
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.TAG_REQUIRED_BY_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.TAG_EXCLUDED_BY_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_UNUSED
    - typings.amphtmlValidator.amphtmlValidatorStrings.EXTENSION_UNUSED
    - typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION
    - typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_REQUIRED_BUT_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.GENERAL_DISALLOWED_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_SCRIPT_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_ATTR
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_STYLE_ATTR
    - typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_ATTR_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_ATTRIBUTE
    - typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT
    - typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_LAYOUT_ATTRIBUTES
    - typings.amphtmlValidator.amphtmlValidatorStrings.IMPLIED_LAYOUT_INVALID
    - typings.amphtmlValidator.amphtmlValidatorStrings.SPECIFIED_LAYOUT_INVALID
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ATTR_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ANYOF_ATTR_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_DIMENSION
    - typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING
    - typings.amphtmlValidator.amphtmlValidatorStrings.WRONG_PARENT_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_TOO_LONG
    - typings.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_AND_INLINE_STYLE_TOO_LONG
    - typings.amphtmlValidator.amphtmlValidatorStrings.INLINE_STYLE_TOO_LONG
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT
    - typings.amphtmlValidator.amphtmlValidatorStrings.CDATA_VIOLATES_BLACKLIST
    - typings.amphtmlValidator.amphtmlValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED
    - typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_JSON_CDATA
    - typings.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_ATTR
    - typings.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL_PROTOCOL
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_DOMAIN
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_RELATIVE_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS
    - typings.amphtmlValidator.amphtmlValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_IN_ATTR_NAME
    - typings.amphtmlValidator.amphtmlValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG_ANCESTOR
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_LAST_CHILD_TAG
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT
    - typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT
    - typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT
    - typings.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_NUM_CHILD_TAGS
    - typings.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_CHILD_TAG_NAME
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME
    - typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_MANUFACTURED_BODY
    - typings.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT
    - typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING
    - typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_REFERENCE_POINT
    - typings.amphtmlValidator.amphtmlValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS
    - typings.amphtmlValidator.amphtmlValidatorStrings.TAG_REFERENCE_POINT_CONFLICT
    - typings.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR
    - typings.amphtmlValidator.amphtmlValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS
    - typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_REQUIRED_EXTENSION
    - typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION
    - typings.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_TOO_COMPLEX
    - typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_UTF8
    - typings.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_SIZE_LIMIT_EXCEEDED
    - typings.amphtmlValidator.amphtmlValidatorStrings.DEV_MODE_ONLY
    - typings.amphtmlValidator.amphtmlValidatorStrings.VALUE_SET_MISMATCH
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_BAD_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_EXCESSIVELY_NESTED
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH
    - typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION
  */
  trait ValidationErrorCode extends StObject
  object ValidationErrorCode {
    
    inline def ATTR_DISALLOWED_BY_IMPLIED_LAYOUT: typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT = "ATTR_DISALLOWED_BY_IMPLIED_LAYOUT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_IMPLIED_LAYOUT]
    
    inline def ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT: typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT = "ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_DISALLOWED_BY_SPECIFIED_LAYOUT]
    
    inline def ATTR_MISSING_REQUIRED_EXTENSION: typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION = "ATTR_MISSING_REQUIRED_EXTENSION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_MISSING_REQUIRED_EXTENSION]
    
    inline def ATTR_REQUIRED_BUT_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_REQUIRED_BUT_MISSING = "ATTR_REQUIRED_BUT_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_REQUIRED_BUT_MISSING]
    
    inline def ATTR_VALUE_REQUIRED_BY_LAYOUT: typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT = "ATTR_VALUE_REQUIRED_BY_LAYOUT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.ATTR_VALUE_REQUIRED_BY_LAYOUT]
    
    inline def BASE_TAG_MUST_PRECEED_ALL_URLS: typings.amphtmlValidator.amphtmlValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS = "BASE_TAG_MUST_PRECEED_ALL_URLS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.BASE_TAG_MUST_PRECEED_ALL_URLS]
    
    inline def CDATA_VIOLATES_BLACKLIST: typings.amphtmlValidator.amphtmlValidatorStrings.CDATA_VIOLATES_BLACKLIST = "CDATA_VIOLATES_BLACKLIST".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CDATA_VIOLATES_BLACKLIST]
    
    inline def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT: typings.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT = "CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT]
    
    inline def CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR: typings.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR = "CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CHILD_TAG_DOES_NOT_SATISFY_REFERENCE_POINT_SINGULAR]
    
    inline def CSS_EXCESSIVELY_NESTED: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_EXCESSIVELY_NESTED = "CSS_EXCESSIVELY_NESTED".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_EXCESSIVELY_NESTED]
    
    inline def CSS_SYNTAX_BAD_URL: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_BAD_URL = "CSS_SYNTAX_BAD_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_BAD_URL]
    
    inline def CSS_SYNTAX_DISALLOWED_DOMAIN: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN = "CSS_SYNTAX_DISALLOWED_DOMAIN".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_DOMAIN]
    
    inline def CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME = "CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_KEYFRAME_INSIDE_KEYFRAME]
    
    inline def CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE = "CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_FEATURE]
    
    inline def CSS_SYNTAX_DISALLOWED_MEDIA_TYPE: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE = "CSS_SYNTAX_DISALLOWED_MEDIA_TYPE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_MEDIA_TYPE]
    
    inline def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE = "CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE]
    
    inline def CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT = "CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_PROPERTY_VALUE_WITH_HINT]
    
    inline def CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME = "CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_QUALIFIED_RULE_MUST_BE_INSIDE_KEYFRAME]
    
    inline def CSS_SYNTAX_DISALLOWED_RELATIVE_URL: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL = "CSS_SYNTAX_DISALLOWED_RELATIVE_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_DISALLOWED_RELATIVE_URL]
    
    inline def CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE = "CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_EOF_IN_PRELUDE_OF_QUALIFIED_RULE]
    
    inline def CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR = "CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_ERROR_IN_PSEUDO_SELECTOR]
    
    inline def CSS_SYNTAX_INCOMPLETE_DECLARATION: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION = "CSS_SYNTAX_INCOMPLETE_DECLARATION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INCOMPLETE_DECLARATION]
    
    inline def CSS_SYNTAX_INVALID_ATTR_SELECTOR: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR = "CSS_SYNTAX_INVALID_ATTR_SELECTOR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_ATTR_SELECTOR]
    
    inline def CSS_SYNTAX_INVALID_AT_RULE: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE = "CSS_SYNTAX_INVALID_AT_RULE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_AT_RULE]
    
    inline def CSS_SYNTAX_INVALID_DECLARATION: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION = "CSS_SYNTAX_INVALID_DECLARATION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_DECLARATION]
    
    inline def CSS_SYNTAX_INVALID_PROPERTY: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY = "CSS_SYNTAX_INVALID_PROPERTY".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY]
    
    inline def CSS_SYNTAX_INVALID_PROPERTY_NOLIST: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST = "CSS_SYNTAX_INVALID_PROPERTY_NOLIST".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_PROPERTY_NOLIST]
    
    inline def CSS_SYNTAX_INVALID_URL: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL = "CSS_SYNTAX_INVALID_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL]
    
    inline def CSS_SYNTAX_INVALID_URL_PROTOCOL: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL = "CSS_SYNTAX_INVALID_URL_PROTOCOL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_INVALID_URL_PROTOCOL]
    
    inline def CSS_SYNTAX_MALFORMED_MEDIA_QUERY: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY = "CSS_SYNTAX_MALFORMED_MEDIA_QUERY".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MALFORMED_MEDIA_QUERY]
    
    inline def CSS_SYNTAX_MISSING_SELECTOR: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR = "CSS_SYNTAX_MISSING_SELECTOR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_SELECTOR]
    
    inline def CSS_SYNTAX_MISSING_URL: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_URL = "CSS_SYNTAX_MISSING_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_MISSING_URL]
    
    inline def CSS_SYNTAX_NOT_A_SELECTOR_START: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START = "CSS_SYNTAX_NOT_A_SELECTOR_START".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_NOT_A_SELECTOR_START]
    
    inline def CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH = "CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_TOGETHER_WITH]
    
    inline def CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE = "CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_DISALLOWED_WITHIN_AT_RULE]
    
    inline def CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION = "CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_PROPERTY_REQUIRES_QUALIFICATION]
    
    inline def CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS = "CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_QUALIFIED_RULE_HAS_NO_DECLARATIONS]
    
    inline def CSS_SYNTAX_STRAY_TRAILING_BACKSLASH: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH = "CSS_SYNTAX_STRAY_TRAILING_BACKSLASH".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_STRAY_TRAILING_BACKSLASH]
    
    inline def CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR = "CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNPARSED_INPUT_REMAINS_IN_SELECTOR]
    
    inline def CSS_SYNTAX_UNTERMINATED_COMMENT: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT = "CSS_SYNTAX_UNTERMINATED_COMMENT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_COMMENT]
    
    inline def CSS_SYNTAX_UNTERMINATED_STRING: typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING = "CSS_SYNTAX_UNTERMINATED_STRING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.CSS_SYNTAX_UNTERMINATED_STRING]
    
    inline def DEPRECATED_ATTR: typings.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_ATTR = "DEPRECATED_ATTR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_ATTR]
    
    inline def DEPRECATED_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_TAG = "DEPRECATED_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DEPRECATED_TAG]
    
    inline def DEV_MODE_ONLY: typings.amphtmlValidator.amphtmlValidatorStrings.DEV_MODE_ONLY = "DEV_MODE_ONLY".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DEV_MODE_ONLY]
    
    inline def DISALLOWED_ATTR: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_ATTR = "DISALLOWED_ATTR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_ATTR]
    
    inline def DISALLOWED_CHILD_TAG_NAME: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_CHILD_TAG_NAME = "DISALLOWED_CHILD_TAG_NAME".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_CHILD_TAG_NAME]
    
    inline def DISALLOWED_DOMAIN: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_DOMAIN = "DISALLOWED_DOMAIN".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_DOMAIN]
    
    inline def DISALLOWED_FIRST_CHILD_TAG_NAME: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME = "DISALLOWED_FIRST_CHILD_TAG_NAME".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_FIRST_CHILD_TAG_NAME]
    
    inline def DISALLOWED_MANUFACTURED_BODY: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_MANUFACTURED_BODY = "DISALLOWED_MANUFACTURED_BODY".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_MANUFACTURED_BODY]
    
    inline def DISALLOWED_PROPERTY_IN_ATTR_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE = "DISALLOWED_PROPERTY_IN_ATTR_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_PROPERTY_IN_ATTR_VALUE]
    
    inline def DISALLOWED_RELATIVE_URL: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_RELATIVE_URL = "DISALLOWED_RELATIVE_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_RELATIVE_URL]
    
    inline def DISALLOWED_SCRIPT_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_SCRIPT_TAG = "DISALLOWED_SCRIPT_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_SCRIPT_TAG]
    
    inline def DISALLOWED_STYLE_ATTR: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_STYLE_ATTR = "DISALLOWED_STYLE_ATTR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_STYLE_ATTR]
    
    inline def DISALLOWED_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG = "DISALLOWED_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG]
    
    inline def DISALLOWED_TAG_ANCESTOR: typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG_ANCESTOR = "DISALLOWED_TAG_ANCESTOR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DISALLOWED_TAG_ANCESTOR]
    
    inline def DOCUMENT_SIZE_LIMIT_EXCEEDED: typings.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_SIZE_LIMIT_EXCEEDED = "DOCUMENT_SIZE_LIMIT_EXCEEDED".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_SIZE_LIMIT_EXCEEDED]
    
    inline def DOCUMENT_TOO_COMPLEX: typings.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_TOO_COMPLEX = "DOCUMENT_TOO_COMPLEX".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DOCUMENT_TOO_COMPLEX]
    
    inline def DUPLICATE_ATTRIBUTE: typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_ATTRIBUTE = "DUPLICATE_ATTRIBUTE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_ATTRIBUTE]
    
    inline def DUPLICATE_DIMENSION: typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_DIMENSION = "DUPLICATE_DIMENSION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_DIMENSION]
    
    inline def DUPLICATE_REFERENCE_POINT: typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_REFERENCE_POINT = "DUPLICATE_REFERENCE_POINT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_REFERENCE_POINT]
    
    inline def DUPLICATE_UNIQUE_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG = "DUPLICATE_UNIQUE_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG]
    
    inline def DUPLICATE_UNIQUE_TAG_WARNING: typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING = "DUPLICATE_UNIQUE_TAG_WARNING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.DUPLICATE_UNIQUE_TAG_WARNING]
    
    inline def EXTENSION_UNUSED: typings.amphtmlValidator.amphtmlValidatorStrings.EXTENSION_UNUSED = "EXTENSION_UNUSED".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.EXTENSION_UNUSED]
    
    inline def GENERAL_DISALLOWED_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.GENERAL_DISALLOWED_TAG = "GENERAL_DISALLOWED_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.GENERAL_DISALLOWED_TAG]
    
    inline def IMPLIED_LAYOUT_INVALID: typings.amphtmlValidator.amphtmlValidatorStrings.IMPLIED_LAYOUT_INVALID = "IMPLIED_LAYOUT_INVALID".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.IMPLIED_LAYOUT_INVALID]
    
    inline def INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT: typings.amphtmlValidator.amphtmlValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT = "INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INCONSISTENT_UNITS_FOR_WIDTH_AND_HEIGHT]
    
    inline def INCORRECT_MIN_NUM_CHILD_TAGS: typings.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS = "INCORRECT_MIN_NUM_CHILD_TAGS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_MIN_NUM_CHILD_TAGS]
    
    inline def INCORRECT_NUM_CHILD_TAGS: typings.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_NUM_CHILD_TAGS = "INCORRECT_NUM_CHILD_TAGS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INCORRECT_NUM_CHILD_TAGS]
    
    inline def INLINE_STYLE_TOO_LONG: typings.amphtmlValidator.amphtmlValidatorStrings.INLINE_STYLE_TOO_LONG = "INLINE_STYLE_TOO_LONG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INLINE_STYLE_TOO_LONG]
    
    inline def INVALID_ATTR_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_ATTR_VALUE = "INVALID_ATTR_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_ATTR_VALUE]
    
    inline def INVALID_JSON_CDATA: typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_JSON_CDATA = "INVALID_JSON_CDATA".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_JSON_CDATA]
    
    inline def INVALID_PROPERTY_VALUE_IN_ATTR_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE = "INVALID_PROPERTY_VALUE_IN_ATTR_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_PROPERTY_VALUE_IN_ATTR_VALUE]
    
    inline def INVALID_URL: typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL = "INVALID_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL]
    
    inline def INVALID_URL_PROTOCOL: typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL_PROTOCOL = "INVALID_URL_PROTOCOL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_URL_PROTOCOL]
    
    inline def INVALID_UTF8: typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_UTF8 = "INVALID_UTF8".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.INVALID_UTF8]
    
    inline def MANDATORY_ANYOF_ATTR_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ANYOF_ATTR_MISSING = "MANDATORY_ANYOF_ATTR_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ANYOF_ATTR_MISSING]
    
    inline def MANDATORY_ATTR_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ATTR_MISSING = "MANDATORY_ATTR_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ATTR_MISSING]
    
    inline def MANDATORY_CDATA_MISSING_OR_INCORRECT: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT = "MANDATORY_CDATA_MISSING_OR_INCORRECT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_CDATA_MISSING_OR_INCORRECT]
    
    inline def MANDATORY_LAST_CHILD_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_LAST_CHILD_TAG = "MANDATORY_LAST_CHILD_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_LAST_CHILD_TAG]
    
    inline def MANDATORY_ONEOF_ATTR_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING = "MANDATORY_ONEOF_ATTR_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_ONEOF_ATTR_MISSING]
    
    inline def MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE = "MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_PROPERTY_MISSING_FROM_ATTR_VALUE]
    
    inline def MANDATORY_REFERENCE_POINT_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING = "MANDATORY_REFERENCE_POINT_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_REFERENCE_POINT_MISSING]
    
    inline def MANDATORY_TAG_ANCESTOR: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR = "MANDATORY_TAG_ANCESTOR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR]
    
    inline def MANDATORY_TAG_ANCESTOR_WITH_HINT: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT = "MANDATORY_TAG_ANCESTOR_WITH_HINT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_ANCESTOR_WITH_HINT]
    
    inline def MANDATORY_TAG_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_MISSING = "MANDATORY_TAG_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MANDATORY_TAG_MISSING]
    
    inline def MISSING_LAYOUT_ATTRIBUTES: typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_LAYOUT_ATTRIBUTES = "MISSING_LAYOUT_ATTRIBUTES".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_LAYOUT_ATTRIBUTES]
    
    inline def MISSING_REQUIRED_EXTENSION: typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_REQUIRED_EXTENSION = "MISSING_REQUIRED_EXTENSION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_REQUIRED_EXTENSION]
    
    inline def MISSING_URL: typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_URL = "MISSING_URL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MISSING_URL]
    
    inline def MUTUALLY_EXCLUSIVE_ATTRS: typings.amphtmlValidator.amphtmlValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS = "MUTUALLY_EXCLUSIVE_ATTRS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.MUTUALLY_EXCLUSIVE_ATTRS]
    
    inline def NON_WHITESPACE_CDATA_ENCOUNTERED: typings.amphtmlValidator.amphtmlValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED = "NON_WHITESPACE_CDATA_ENCOUNTERED".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.NON_WHITESPACE_CDATA_ENCOUNTERED]
    
    inline def SPECIFIED_LAYOUT_INVALID: typings.amphtmlValidator.amphtmlValidatorStrings.SPECIFIED_LAYOUT_INVALID = "SPECIFIED_LAYOUT_INVALID".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.SPECIFIED_LAYOUT_INVALID]
    
    inline def STYLESHEET_AND_INLINE_STYLE_TOO_LONG: typings.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_AND_INLINE_STYLE_TOO_LONG = "STYLESHEET_AND_INLINE_STYLE_TOO_LONG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_AND_INLINE_STYLE_TOO_LONG]
    
    inline def STYLESHEET_TOO_LONG: typings.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_TOO_LONG = "STYLESHEET_TOO_LONG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.STYLESHEET_TOO_LONG]
    
    inline def TAG_EXCLUDED_BY_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.TAG_EXCLUDED_BY_TAG = "TAG_EXCLUDED_BY_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.TAG_EXCLUDED_BY_TAG]
    
    inline def TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS: typings.amphtmlValidator.amphtmlValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS = "TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.TAG_NOT_ALLOWED_TO_HAVE_SIBLINGS]
    
    inline def TAG_REFERENCE_POINT_CONFLICT: typings.amphtmlValidator.amphtmlValidatorStrings.TAG_REFERENCE_POINT_CONFLICT = "TAG_REFERENCE_POINT_CONFLICT".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.TAG_REFERENCE_POINT_CONFLICT]
    
    inline def TAG_REQUIRED_BY_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.TAG_REQUIRED_BY_MISSING = "TAG_REQUIRED_BY_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.TAG_REQUIRED_BY_MISSING]
    
    inline def TEMPLATE_IN_ATTR_NAME: typings.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_IN_ATTR_NAME = "TEMPLATE_IN_ATTR_NAME".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_IN_ATTR_NAME]
    
    inline def TEMPLATE_PARTIAL_IN_ATTR_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE = "TEMPLATE_PARTIAL_IN_ATTR_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.TEMPLATE_PARTIAL_IN_ATTR_VALUE]
    
    inline def UNESCAPED_TEMPLATE_IN_ATTR_VALUE: typings.amphtmlValidator.amphtmlValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE = "UNESCAPED_TEMPLATE_IN_ATTR_VALUE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.UNESCAPED_TEMPLATE_IN_ATTR_VALUE]
    
    inline def UNKNOWN_CODE: typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_CODE = "UNKNOWN_CODE".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_CODE]
    
    inline def VALUE_SET_MISMATCH: typings.amphtmlValidator.amphtmlValidatorStrings.VALUE_SET_MISMATCH = "VALUE_SET_MISMATCH".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.VALUE_SET_MISMATCH]
    
    inline def WARNING_EXTENSION_DEPRECATED_VERSION: typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION = "WARNING_EXTENSION_DEPRECATED_VERSION".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_DEPRECATED_VERSION]
    
    inline def WARNING_EXTENSION_UNUSED: typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_UNUSED = "WARNING_EXTENSION_UNUSED".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_EXTENSION_UNUSED]
    
    inline def WARNING_TAG_REQUIRED_BY_MISSING: typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING = "WARNING_TAG_REQUIRED_BY_MISSING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.WARNING_TAG_REQUIRED_BY_MISSING]
    
    inline def WRONG_PARENT_TAG: typings.amphtmlValidator.amphtmlValidatorStrings.WRONG_PARENT_TAG = "WRONG_PARENT_TAG".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.WRONG_PARENT_TAG]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY
    - typings.amphtmlValidator.amphtmlValidatorStrings.ERROR
    - typings.amphtmlValidator.amphtmlValidatorStrings.WARNING
  */
  trait ValidationErrorSeverity extends StObject
  object ValidationErrorSeverity {
    
    inline def ERROR: typings.amphtmlValidator.amphtmlValidatorStrings.ERROR = "ERROR".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.ERROR]
    
    inline def UNKNOWN_SEVERITY: typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY = "UNKNOWN_SEVERITY".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN_SEVERITY]
    
    inline def WARNING: typings.amphtmlValidator.amphtmlValidatorStrings.WARNING = "WARNING".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.WARNING]
  }
  
  trait ValidationResult extends StObject {
    
    var errors: js.Array[ValidationError]
    
    var status: ValidationResultStatus
  }
  object ValidationResult {
    
    inline def apply(errors: js.Array[ValidationError], status: ValidationResultStatus): ValidationResult = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[ValidationResult]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ValidationResult] (val x: Self) extends AnyVal {
      
      inline def setErrors(value: js.Array[ValidationError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ValidationError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setStatus(value: ValidationResultStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN
    - typings.amphtmlValidator.amphtmlValidatorStrings.PASS
    - typings.amphtmlValidator.amphtmlValidatorStrings.FAIL
  */
  trait ValidationResultStatus extends StObject
  object ValidationResultStatus {
    
    inline def FAIL: typings.amphtmlValidator.amphtmlValidatorStrings.FAIL = "FAIL".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.FAIL]
    
    inline def PASS: typings.amphtmlValidator.amphtmlValidatorStrings.PASS = "PASS".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.PASS]
    
    inline def UNKNOWN: typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN = "UNKNOWN".asInstanceOf[typings.amphtmlValidator.amphtmlValidatorStrings.UNKNOWN]
  }
}
