package typings.apidevtoolsJsonSchemaRefParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the default export of JSON Schema $Ref Parser. You can creates instances of this class using new $RefParser(), or you can just call its static methods.
  *
  * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html
  */
@JSImport("@apidevtools/json-schema-ref-parser", JSImport.Namespace)
@js.native
class ^ () extends RefParser
@JSImport("@apidevtools/json-schema-ref-parser", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def bundle(baseUrl: String, schema: String, options: Options): js.Promise[JSONSchema] = js.native
  def bundle(baseUrl: String, schema: String, options: Options, callback: SchemaCallback): Unit = js.native
  def bundle(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[JSONSchema] = js.native
  def bundle(baseUrl: String, schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = js.native
  def bundle(schema: String): js.Promise[JSONSchema] = js.native
  /**
    * Bundles all referenced files/URLs into a single schema that only has internal `$ref` pointers. This lets you split-up your schema however you want while you're building it, but easily combine all those files together when it's time to package or distribute the schema to other people. The resulting schema size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
    *
    * This also eliminates the risk of circular references, so the schema can be safely serialized using `JSON.stringify()`.
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html#bundleschema-options-callback
    *
    * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the bundled schema object
    */
  def bundle(schema: String, callback: SchemaCallback): Unit = js.native
  def bundle(schema: String, options: Options): js.Promise[JSONSchema] = js.native
  def bundle(schema: String, options: Options, callback: SchemaCallback): Unit = js.native
  def bundle(schema: JSONSchema): js.Promise[JSONSchema] = js.native
  def bundle(schema: JSONSchema, callback: SchemaCallback): Unit = js.native
  def bundle(schema: JSONSchema, options: Options): js.Promise[JSONSchema] = js.native
  def bundle(schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = js.native
  
  def dereference(baseUrl: String, schema: String, options: Options): js.Promise[JSONSchema] = js.native
  def dereference(baseUrl: String, schema: String, options: Options, callback: SchemaCallback): Unit = js.native
  def dereference(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[JSONSchema] = js.native
  def dereference(baseUrl: String, schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = js.native
  def dereference(schema: String): js.Promise[JSONSchema] = js.native
  /**
    * Dereferences all `$ref` pointers in the JSON Schema, replacing each reference with its resolved value. This results in a schema object that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
    *
    * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the schema using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html#dereferenceschema-options-callback
    *
    * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced schema object
    */
  def dereference(schema: String, callback: SchemaCallback): Unit = js.native
  def dereference(schema: String, options: Options): js.Promise[JSONSchema] = js.native
  def dereference(schema: String, options: Options, callback: SchemaCallback): Unit = js.native
  def dereference(schema: JSONSchema): js.Promise[JSONSchema] = js.native
  def dereference(schema: JSONSchema, callback: SchemaCallback): Unit = js.native
  def dereference(schema: JSONSchema, options: Options): js.Promise[JSONSchema] = js.native
  def dereference(schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = js.native
  
  def parse(baseUrl: String, schema: String, options: Options): js.Promise[JSONSchema] = js.native
  def parse(baseUrl: String, schema: String, options: Options, callback: SchemaCallback): Unit = js.native
  def parse(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[JSONSchema] = js.native
  def parse(baseUrl: String, schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = js.native
  def parse(schema: String): js.Promise[JSONSchema] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Parses the given JSON Schema file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html#parseschema-options-callback
    *
    * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the parsed schema object, or an error
    */
  def parse(schema: String, callback: SchemaCallback): Unit = js.native
  def parse(schema: String, options: Options): js.Promise[JSONSchema] = js.native
  def parse(schema: String, options: Options, callback: SchemaCallback): Unit = js.native
  def parse(schema: JSONSchema): js.Promise[JSONSchema] = js.native
  def parse(schema: JSONSchema, callback: SchemaCallback): Unit = js.native
  def parse(schema: JSONSchema, options: Options): js.Promise[JSONSchema] = js.native
  def parse(schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = js.native
  
  def resolve(baseUrl: String, schema: String, options: Options): js.Promise[Refs] = js.native
  def resolve(baseUrl: String, schema: String, options: Options, callback: RefsCallback): Unit = js.native
  def resolve(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[Refs] = js.native
  def resolve(baseUrl: String, schema: JSONSchema, options: Options, callback: RefsCallback): Unit = js.native
  def resolve(schema: String): js.Promise[Refs] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Resolves all JSON references (`$ref` pointers) in the given JSON Schema file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html#resolveschema-options-callback
    *
    * @param schema A JSON Schema object, or the file path or URL of a JSON Schema file. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive a `$Refs` object
    */
  def resolve(schema: String, callback: RefsCallback): Unit = js.native
  def resolve(schema: String, options: Options): js.Promise[Refs] = js.native
  def resolve(schema: String, options: Options, callback: RefsCallback): Unit = js.native
  def resolve(schema: JSONSchema): js.Promise[Refs] = js.native
  def resolve(schema: JSONSchema, callback: RefsCallback): Unit = js.native
  def resolve(schema: JSONSchema, options: Options): js.Promise[Refs] = js.native
  def resolve(schema: JSONSchema, options: Options, callback: RefsCallback): Unit = js.native
}
