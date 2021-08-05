package typings.apidevtoolsJsonSchemaRefParser

import org.scalablytyped.runtime.StringDictionary
import typings.apidevtoolsJsonSchemaRefParser.anon.Circular
import typings.apidevtoolsJsonSchemaRefParser.anon.Dictkey
import typings.apidevtoolsJsonSchemaRefParser.anon.External
import typings.jsonSchema.mod.JSONSchema4
import typings.jsonSchema.mod.JSONSchema4Type
import typings.jsonSchema.mod.JSONSchema6
import typings.jsonSchema.mod.JSONSchema6Type
import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This is the default export of JSON Schema $Ref Parser. You can creates instances of this class using new $RefParser(), or you can just call its static methods.
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html
    */
  @JSImport("@apidevtools/json-schema-ref-parser", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with RefParser
  @JSImport("@apidevtools/json-schema-ref-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@apidevtools/json-schema-ref-parser", "InvalidPointerError")
  @js.native
  class InvalidPointerError () extends JSONParserError {
    
    @JSName("code")
    val code_InvalidPointerError: /* "EINVALIDPOINTER" */ String = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "JSONParserError")
  @js.native
  class JSONParserError ()
    extends StObject
       with Error {
    
    val code: JSONParserErrorType = js.native
    
    val errors: String = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    val path: js.Array[String | Double] = js.native
    
    val source: String = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "JSONParserErrorGroup")
  @js.native
  class JSONParserErrorGroup ()
    extends StObject
       with Error {
    
    /**
      * List of all errors
      *
      * See https://github.com/APIDevTools/json-schema-ref-parser/blob/master/docs/ref-parser.md#errors
      */
    val errors: js.Array[
        JSONParserError | InvalidPointerError | ResolverError | ParserError | MissingPointerError | UnmatchedParserError | UnmatchedResolverError
      ] = js.native
    
    /**
      * The fields property is a `$RefParser` instance
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html
      */
    val files: RefParser = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "MissingPointerError")
  @js.native
  class MissingPointerError () extends JSONParserError {
    
    @JSName("code")
    val code_MissingPointerError: /* "EMISSINGPOINTER" */ String = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "ParserError")
  @js.native
  class ParserError () extends JSONParserError {
    
    @JSName("code")
    val code_ParserError: /* "EPARSER" */ String = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "$Refs")
  @js.native
  class Refs () extends StObject {
    
    /**
      * This property is true if the schema contains any circular references. You may want to check this property before serializing the dereferenced schema as JSON, since JSON.stringify() does not support circular references by default.
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/refs.html#circular
      */
    var circular: Boolean = js.native
    
    /**
      * Returns `true` if the given path exists in the schema; otherwise, returns `false`
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/refs.html#existsref
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      */
    def exists($ref: String): Boolean = js.native
    
    /**
      * Gets the value at the given path in the schema. Throws an error if the path does not exist.
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/refs.html#getref
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      */
    def get($ref: String): JSONSchema4Type | JSONSchema6Type = js.native
    
    /**
      * Returns the paths/URLs of all the files in your schema (including the main schema file).
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/refs.html#pathstypes
      *
      * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
      */
    def paths(types: String*): js.Array[String] = js.native
    
    /**
      * Sets the value at the given path in the schema. If the property, or any of its parents, don't exist, they will be created.
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      * @param value The value to assign. Can be anything (object, string, number, etc.)
      */
    def set($ref: String, value: JSONSchema4Type | JSONSchema6Type): Unit = js.native
    
    /**
      * Returns a map of paths/URLs and their correspond values.
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/refs.html#valuestypes
      *
      * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
      */
    def values(types: String*): StringDictionary[JSONSchema] = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "ResolverError")
  @js.native
  class ResolverError () extends JSONParserError {
    
    @JSName("code")
    val code_ResolverError: /* "ERESOLVER" */ String = js.native
    
    val ioErrorCode: js.UndefOr[String] = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "UnmatchedParserError")
  @js.native
  class UnmatchedParserError () extends JSONParserError {
    
    @JSName("code")
    val code_UnmatchedParserError: /* "EUNMATCHEDPARSER" */ String = js.native
  }
  
  @JSImport("@apidevtools/json-schema-ref-parser", "UnmatchedResolverError")
  @js.native
  class UnmatchedResolverError () extends JSONParserError {
    
    @JSName("code")
    val code_UnmatchedResolverError: /* "EUNMATCHEDRESOLVER" */ String = js.native
  }
  
  /* static member */
  inline def bundle(baseUrl: String, schema: String, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  /* static member */
  inline def bundle(baseUrl: String, schema: String, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bundle(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  inline def bundle(baseUrl: String, schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def bundle(schema: String): js.Promise[JSONSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONSchema]]
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
  /* static member */
  inline def bundle(schema: String, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def bundle(schema: String, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  /* static member */
  inline def bundle(schema: String, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bundle(schema: JSONSchema): js.Promise[JSONSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONSchema]]
  inline def bundle(schema: JSONSchema, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def bundle(schema: JSONSchema, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  inline def bundle(schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("bundle")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def dereference(baseUrl: String, schema: String, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  /* static member */
  inline def dereference(baseUrl: String, schema: String, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dereference(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  inline def dereference(baseUrl: String, schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def dereference(schema: String): js.Promise[JSONSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONSchema]]
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
  /* static member */
  inline def dereference(schema: String, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def dereference(schema: String, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  /* static member */
  inline def dereference(schema: String, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dereference(schema: JSONSchema): js.Promise[JSONSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONSchema]]
  inline def dereference(schema: JSONSchema, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def dereference(schema: JSONSchema, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  inline def dereference(schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("dereference")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def parse(baseUrl: String, schema: String, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  /* static member */
  inline def parse(baseUrl: String, schema: String, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  inline def parse(baseUrl: String, schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def parse(schema: String): js.Promise[JSONSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONSchema]]
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
  /* static member */
  inline def parse(schema: String, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def parse(schema: String, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  /* static member */
  inline def parse(schema: String, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(schema: JSONSchema): js.Promise[JSONSchema] = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[JSONSchema]]
  inline def parse(schema: JSONSchema, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def parse(schema: JSONSchema, options: Options): js.Promise[JSONSchema] = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[JSONSchema]]
  inline def parse(schema: JSONSchema, options: Options, callback: SchemaCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("parse")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /* static member */
  inline def resolve(baseUrl: String, schema: String, options: Options): js.Promise[Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Refs]]
  /* static member */
  inline def resolve(baseUrl: String, schema: String, options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(baseUrl: String, schema: JSONSchema, options: Options): js.Promise[Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Refs]]
  inline def resolve(baseUrl: String, schema: JSONSchema, options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(baseUrl.asInstanceOf[js.Any], schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def resolve(schema: String): js.Promise[Refs] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Refs]]
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
  /* static member */
  inline def resolve(schema: String, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /* static member */
  inline def resolve(schema: String, options: Options): js.Promise[Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Refs]]
  /* static member */
  inline def resolve(schema: String, options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(schema: JSONSchema): js.Promise[Refs] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Refs]]
  inline def resolve(schema: JSONSchema, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def resolve(schema: JSONSchema, options: Options): js.Promise[Refs] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Refs]]
  inline def resolve(schema: JSONSchema, options: Options, callback: RefsCallback): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(schema.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait FileInfo extends StObject {
    
    /**
      * The raw file contents, in whatever form they were returned by the resolver that read the file.
      */
    var data: String | Buffer
    
    /**
      * The lowercase file extension, such as ".json", ".yaml", ".txt", etc.
      */
    var `extension`: String
    
    /**
      * The full URL of the file. This could be any type of URL, including "http://", "https://", "file://", "ftp://", "mongodb://", or even a local filesystem path (when running in Node.js).
      */
    var url: String
  }
  object FileInfo {
    
    inline def apply(data: String | Buffer, `extension`: String, url: String): FileInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.updateDynamic("extension")(`extension`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    extension [Self <: FileInfo](x: Self) {
      
      inline def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@apidevtools/json-schema-ref-parser.@apidevtools/json-schema-ref-parser.ResolverOptions> */
  trait HTTPResolverOptions extends StObject {
    
    var canRead: js.UndefOr[
        Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.undefined
    
    /**
      * You can specify any HTTP headers that should be sent when downloading files. For example, some servers may require you to set the `Accept` or `Referrer` header.
      */
    var headers: js.UndefOr[js.Object] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var read: js.UndefOr[
        js.Function2[
          /* file */ FileInfo, 
          /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, js.Any]], 
          String | Buffer | (js.Promise[String | Buffer])
        ]
      ] = js.undefined
    
    /**
      * The maximum number of HTTP redirects to follow per file. The default is 5. To disable automatic following of redirects, set this to zero.
      */
    var redirects: js.UndefOr[Double] = js.undefined
    
    /**
      * The amount of time (in milliseconds) to wait for a response from the server when downloading files. The default is 5 seconds.
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Set this to `true` if you're downloading files from a CORS-enabled server that requires authentication
      */
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object HTTPResolverOptions {
    
    inline def apply(): HTTPResolverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPResolverOptions]
    }
    
    extension [Self <: HTTPResolverOptions](x: Self) {
      
      inline def setCanRead(value: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
      
      inline def setCanReadFunction1(value: /* file */ FileInfo => Boolean): Self = StObject.set(x, "canRead", js.Any.fromFunction1(value))
      
      inline def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
      
      inline def setCanReadVarargs(value: String*): Self = StObject.set(x, "canRead", js.Array(value :_*))
      
      inline def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setRead(
        value: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, js.Any]]) => String | Buffer | (js.Promise[String | Buffer])
      ): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      inline def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNKNOWN
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EPARSER
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNMATCHEDPARSER
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.ERESOLVER
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNMATCHEDRESOLVER
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EMISSINGPOINTER
    - typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EINVALIDPOINTER
  */
  trait JSONParserErrorType extends StObject
  object JSONParserErrorType {
    
    inline def EINVALIDPOINTER: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EINVALIDPOINTER = "EINVALIDPOINTER".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EINVALIDPOINTER]
    
    inline def EMISSINGPOINTER: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EMISSINGPOINTER = "EMISSINGPOINTER".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EMISSINGPOINTER]
    
    inline def EPARSER: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EPARSER = "EPARSER".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EPARSER]
    
    inline def ERESOLVER: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.ERESOLVER = "ERESOLVER".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.ERESOLVER]
    
    inline def EUNKNOWN: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNKNOWN = "EUNKNOWN".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNKNOWN]
    
    inline def EUNMATCHEDPARSER: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNMATCHEDPARSER = "EUNMATCHEDPARSER".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNMATCHEDPARSER]
    
    inline def EUNMATCHEDRESOLVER: typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNMATCHEDRESOLVER = "EUNMATCHEDRESOLVER".asInstanceOf[typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.EUNMATCHEDRESOLVER]
  }
  
  type JSONSchema = JSONSchema4 | JSONSchema6
  
  trait Options extends StObject {
    
    /**
      * By default, JSON Schema $Ref Parser throws the first error it encounters. Setting `continueOnError` to `true`
      * causes it to keep processing as much as possible and then throw a single error that contains all errors
      * that were encountered.
      */
    var continueOnError: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The `dereference` options control how JSON Schema `$Ref` Parser will dereference `$ref` pointers within the JSON schema.
      */
    var dereference: js.UndefOr[Circular] = js.undefined
    
    /**
      * The `parse` options determine how different types of files will be parsed.
      *
      * JSON Schema `$Ref` Parser comes with built-in JSON, YAML, plain-text, and binary parsers, any of which you can configure or disable. You can also add your own custom parsers if you want.
      */
    var parse: js.UndefOr[Dictkey] = js.undefined
    
    /**
      * The `resolve` options control how JSON Schema $Ref Parser will resolve file paths and URLs, and how those files will be read/downloaded.
      *
      * JSON Schema `$Ref` Parser comes with built-in support for HTTP and HTTPS, as well as support for local files (when running in Node.js). You can configure or disable either of these built-in resolvers. You can also add your own custom resolvers if you want.
      */
    var resolve: js.UndefOr[External] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setContinueOnError(value: Boolean): Self = StObject.set(x, "continueOnError", value.asInstanceOf[js.Any])
      
      inline def setContinueOnErrorUndefined: Self = StObject.set(x, "continueOnError", js.undefined)
      
      inline def setDereference(value: Circular): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      inline def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      inline def setParse(value: Dictkey): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      inline def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      inline def setResolve(value: External): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    }
  }
  
  @js.native
  trait ParserOptions extends StObject {
    
    /**
      * All of the built-in parsers allow empty files by default. The JSON and YAML parsers will parse empty files as `undefined`. The text parser will parse empty files as an empty string. The binary parser will parse empty files as an empty byte array.
      *
      * You can set `allowEmpty: false` on any parser, which will cause an error to be thrown if a file empty.
      */
    var allowEmpty: js.UndefOr[Boolean] = js.native
    
    /**
      * Determines which parsers will be used for which files.
      *
      * A regular expression can be used to match files by their full path. A string (or array of strings) can be used to match files by their file extension. Or a function can be used to perform more complex matching logic. See the custom parser docs for details.
      */
    var canParse: js.UndefOr[
        Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.native
    
    /**
      * Parsers run in a specific order, relative to other parsers. For example, a parser with `order: 5` will run before a parser with `order: 10`. If a parser is unable to successfully parse a file, then the next parser is tried, until one succeeds or they all fail.
      *
      * You can change the order in which parsers run, which is useful if you know that most of your referenced files will be a certain type, or if you add your own custom parser that you want to run first.
      */
    var order: js.UndefOr[Double] = js.native
    
    /**
      * This is where the real work of a parser happens. The `parse` method accepts the same file info object as the `canParse` function, but rather than returning a boolean value, the `parse` method should return a JavaScript representation of the file contents.  For our CSV parser, that is a two-dimensional array of lines and values.  For your parser, it might be an object, a string, a custom class, or anything else.
      *
      * Unlike the `canParse` function, the `parse` method can also be asynchronous. This might be important if your parser needs to retrieve data from a database or if it relies on an external HTTP service to return the parsed value.  You can return your asynchronous value via a [Promise](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise) or a Node.js-style error-first callback.  Here are examples of both approaches:
      */
    def parse(file: FileInfo): js.Any | js.Promise[js.Any] = js.native
    def parse(file: FileInfo, callback: js.Function2[/* error */ Error | Null, /* data */ String | Null, js.Any]): js.Any | js.Promise[js.Any] = js.native
  }
  
  /**
    * This is the default export of JSON Schema $Ref Parser. You can creates instances of this class using new $RefParser(), or you can just call its static methods.
    *
    * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html
    */
  @js.native
  trait RefParser extends StObject {
    
    /**
      * The $refs property is a `$Refs` object, which lets you access all of the externally-referenced files in the schema, as well as easily get and set specific values in the schema using JSON pointers.
      *
      * This is the same value that is passed to the callback function (or Promise) when calling the `resolve` method.
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html#refs
      */
    @JSName("$refs")
    var $refs: Refs = js.native
    
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
    
    /**
      * The `schema` property is the parsed/bundled/dereferenced JSON Schema object. This is the same value that is passed to the callback function (or Promise) when calling the parse, bundle, or dereference methods.
      *
      * See https://apitools.dev/json-schema-ref-parser/docs/ref-parser.html#schema
      */
    var schema: JSONSchema = js.native
  }
  
  type RefsCallback = js.Function2[/* err */ Error | Null, /* $refs */ js.UndefOr[Refs], js.Any]
  
  @js.native
  trait ResolverOptions extends StObject {
    
    /**
      * The `canRead` property tells JSON Schema `$Ref` Parser what kind of files your resolver can read. In this example, we've simply specified a regular expression that matches "mogodb://" URLs, but we could have used a simple boolean, or even a function with custom logic to determine which files to resolve. Here are examples of each approach:
      */
    var canRead: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean]) = js.native
    
    /**
      * All resolvers have an order property, even the built-in resolvers. If you don't specify an order property, then your resolver will run last. Specifying `order: 1`, like we did in this example, will make your resolver run first. Or you can squeeze your resolver in-between some of the built-in resolvers. For example, `order: 101` would make it run after the file resolver, but before the HTTP resolver. You can see the order of all the built-in resolvers by looking at their source code.
      *
      * The order property and canRead property are related to each other. For each file that JSON Schema $Ref Parser needs to resolve, it first determines which resolvers can read that file by checking their canRead property. If only one resolver matches a file, then only that one resolver is called, regardless of its order. If multiple resolvers match a file, then those resolvers are tried in order until one of them successfully reads the file. Once a resolver successfully reads the file, the rest of the resolvers are skipped.
      */
    var order: js.UndefOr[Double] = js.native
    
    /**
      * This is where the real work of a resolver happens. The `read` method accepts the same file info object as the `canRead` function, but rather than returning a boolean value, the `read` method should return the contents of the file. The file contents should be returned in as raw a form as possible, such as a string or a byte array. Any further parsing or processing should be done by parsers.
      *
      * Unlike the `canRead` function, the `read` method can also be asynchronous. This might be important if your resolver needs to read data from a database or some other external source. You can return your asynchronous value using either an ES6 Promise or a Node.js-style error-first callback. Of course, if your resolver has the ability to return its data synchronously, then that's fine too. Here are examples of all three approaches:
      */
    def read(file: FileInfo): String | Buffer | (js.Promise[String | Buffer]) = js.native
    def read(file: FileInfo, callback: js.Function2[/* error */ Error | Null, /* data */ String | Null, js.Any]): String | Buffer | (js.Promise[String | Buffer]) = js.native
  }
  
  type SchemaCallback = js.Function2[/* err */ Error | Null, /* schema */ js.UndefOr[JSONSchema], js.Any]
}
