package typings
package ajvLib.ajvMod.ajvNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Ajv extends js.Object {
  var errors: js.UndefOr[js.Array[ErrorObject] | scala.Null] = js.native
  def addFormat(name: java.lang.String, format: FormatDefinition): Ajv = js.native
  /**
    * Add custom format
    * @param {string} name format name
    * @param {string|RegExp|Function} format string is converted to RegExp; function should return boolean (true when valid)
    * @return {Ajv} this for method chaining
    */
  def addFormat(name: java.lang.String, format: FormatValidator): Ajv = js.native
  /**
    * Define custom keyword
    * @this  Ajv
    * @param {string} keyword custom keyword, should be a valid identifier, should be different from all standard, custom and macro keywords.
    * @param {object} definition keyword definition object with properties `type` (type(s) which the keyword applies to), `validate` or `compile`.
    * @return {Ajv} this for method chaining
    */
  def addKeyword(keyword: java.lang.String, definition: KeywordDefinition): Ajv = js.native
  /**
    * Add schema that will be used to validate other schemas
    * options in META_IGNORE_OPTIONS are alway set to false
    * @param {object} schema schema object
    * @param {string} key optional schema key
    * @return {Ajv} this for method chaining
    */
  def addMetaSchema(schema: js.Object): Ajv = js.native
  def addMetaSchema(schema: js.Object, key: java.lang.String): Ajv = js.native
  /**
    * Adds schema to the instance.
    * @param {object|Array} schema schema or array of schemas. If array is passed, `key` and other parameters will be ignored.
    * @param {string} key Optional schema key. Can be passed to `validate` method instead of schema object or id/ref. One schema per instance can have empty `id` and `key`.
    * @return {Ajv} this for method chaining
    */
  def addSchema(schema: js.Array[js.Object]): Ajv = js.native
  def addSchema(schema: js.Array[js.Object], key: java.lang.String): Ajv = js.native
  def addSchema(schema: js.Object): Ajv = js.native
  def addSchema(schema: js.Object, key: java.lang.String): Ajv = js.native
  /**
    * Create validating function for passed schema.
    * @param  {object|Boolean} schema schema object
    * @return {Function} validating function
    */
  def compile(schema: js.Object): ValidateFunction = js.native
  def compile(schema: scala.Boolean): ValidateFunction = js.native
  /**
    * Creates validating function for passed schema with asynchronous loading of missing schemas.
    * `loadSchema` option should be a function that accepts schema uri and node-style callback.
    * @this  Ajv
    * @param {object|Boolean} schema schema object
    * @param {Boolean} meta optional true to compile meta-schema; this parameter can be skipped
    * @param {Function} callback optional node-style callback, it is always called with 2 parameters: error (or null) and validating function.
    * @return {PromiseLike<ValidateFunction>} validating function
    */
  def compileAsync(schema: js.Object): js.Thenable[ValidateFunction] = js.native
  def compileAsync(schema: js.Object, meta: scala.Boolean): js.Thenable[ValidateFunction] = js.native
  def compileAsync(
    schema: js.Object,
    meta: scala.Boolean,
    callback: js.Function2[/* err */ stdLib.Error, /* validate */ ValidateFunction, _]
  ): js.Thenable[ValidateFunction] = js.native
  def compileAsync(schema: scala.Boolean): js.Thenable[ValidateFunction] = js.native
  def compileAsync(schema: scala.Boolean, meta: scala.Boolean): js.Thenable[ValidateFunction] = js.native
  def compileAsync(
    schema: scala.Boolean,
    meta: scala.Boolean,
    callback: js.Function2[/* err */ stdLib.Error, /* validate */ ValidateFunction, _]
  ): js.Thenable[ValidateFunction] = js.native
  /**
    * Convert array of error message objects to string
    * @param  {Array<object>} errors optional array of validation errors, if not passed errors from the instance are used.
    * @param  {object} options optional options with properties `separator` and `dataVar`.
    * @return {string} human readable string with all errors descriptions
    */
  def errorsText(): java.lang.String = js.native
  def errorsText(errors: js.Array[ErrorObject]): java.lang.String = js.native
  def errorsText(errors: js.Array[ErrorObject], options: ErrorsTextOptions): java.lang.String = js.native
  def errorsText(errors: scala.Null, options: ErrorsTextOptions): java.lang.String = js.native
  /**
    * Get keyword definition
    * @this  Ajv
    * @param {string} keyword pre-defined or custom keyword.
    * @return {object|Boolean} custom keyword definition, `true` if it is a predefined keyword, `false` otherwise.
    */
  def getKeyword(keyword: java.lang.String): js.Object | scala.Boolean = js.native
  /**
    * Get compiled schema from the instance by `key` or `ref`.
    * @param  {string} keyRef `key` that was passed to `addSchema` or full schema reference (`schema.id` or resolved id).
    * @return {Function} schema validating function (with property `schema`).
    */
  def getSchema(keyRef: java.lang.String): ValidateFunction = js.native
  /**
    * Remove keyword
    * @this  Ajv
    * @param {string} keyword pre-defined or custom keyword.
    * @return {Ajv} this for method chaining
    */
  def removeKeyword(keyword: java.lang.String): Ajv = js.native
  /**
    * Remove cached schema(s).
    * If no parameter is passed all schemas but meta-schemas are removed.
    * If RegExp is passed all schemas with key/id matching pattern but meta-schemas are removed.
    * Even if schema is referenced by other schemas it still can be removed as other schemas have local references.
    * @param  {string|object|RegExp|Boolean} schemaKeyRef key, ref, pattern to match key/ref or schema object
    * @return {Ajv} this for method chaining
    */
  def removeSchema(): Ajv = js.native
  def removeSchema(schemaKeyRef: java.lang.String): Ajv = js.native
  def removeSchema(schemaKeyRef: js.Object): Ajv = js.native
  def removeSchema(schemaKeyRef: scala.Boolean): Ajv = js.native
  def removeSchema(schemaKeyRef: stdLib.RegExp): Ajv = js.native
  def validate(schemaKeyRef: java.lang.String, data: js.Any): scala.Boolean | js.Thenable[_] = js.native
  /**
    * Validate data using schema
    * Schema will be compiled and cached (using serialized JSON as key, [fast-json-stable-stringify](https://github.com/epoberezkin/fast-json-stable-stringify) is used to serialize by default).
    * @param  {string|object|Boolean} schemaKeyRef key, ref or schema object
    * @param  {Any} data to be validated
    * @return {Boolean} validation result. Errors from the last validation will be available in `ajv.errors` (and also in compiled schema: `schema.errors`).
    */
  def validate(schemaKeyRef: js.Object, data: js.Any): scala.Boolean | js.Thenable[_] = js.native
  def validate(schemaKeyRef: scala.Boolean, data: js.Any): scala.Boolean | js.Thenable[_] = js.native
  /**
    * Validate keyword
    * @this  Ajv
    * @param {object} definition keyword definition object
    * @param {boolean} throwError true to throw exception if definition is invalid
    * @return {boolean} validation result
    */
  def validateKeyword(definition: KeywordDefinition, throwError: scala.Boolean): scala.Boolean = js.native
  /**
    * Validate schema
    * @param {object|Boolean} schema schema to validate
    * @return {Boolean} true if schema is valid
    */
  def validateSchema(schema: js.Object): scala.Boolean = js.native
  def validateSchema(schema: scala.Boolean): scala.Boolean = js.native
}

