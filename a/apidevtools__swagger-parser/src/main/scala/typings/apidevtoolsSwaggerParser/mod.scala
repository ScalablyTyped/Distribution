package typings.apidevtoolsSwaggerParser

import org.scalablytyped.runtime.StringDictionary
import typings.apidevtoolsSwaggerParser.anon.Circular
import typings.apidevtoolsSwaggerParser.anon.Dictkey
import typings.apidevtoolsSwaggerParser.anon.External
import typings.apidevtoolsSwaggerParser.anon.Schema
import typings.node.Buffer
import typings.openapiTypes.mod.OpenAPI.Document
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * This is the default export of Swagger Parser. You can creates instances of this class using new SwaggerParser(), or you can just call its static methods.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html
    */
  @JSImport("@apidevtools/swagger-parser", JSImport.Namespace)
  @js.native
  class ^ () extends SwaggerParser
  
  @JSImport("@apidevtools/swagger-parser", "$Refs")
  @js.native
  class Refs () extends StObject {
    
    /**
      * This property is true if the API definition contains any circular references. You may want to check this property before serializing the dereferenced API definition as JSON, since JSON.stringify() does not support circular references by default.
      *
      * See https://apitools.dev/swagger-parser/docs/refs.html#circular
      */
    var circular: Boolean = js.native
    
    /**
      * Returns `true` if the given path exists in the OpenAPI definition; otherwise, returns `false`
      *
      * See https://apitools.dev/swagger-parser/docs/refs.html#existsref
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      */
    def exists($ref: String): Boolean = js.native
    
    /**
      * Gets the value at the given path in the OpenAPI definition. Throws an error if the path does not exist.
      *
      * See https://apitools.dev/swagger-parser/docs/refs.html#getref
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      */
    def get($ref: String): js.Any = js.native
    
    /**
      * Returns the paths/URLs of all the files in your API definition (including the main API definition file).
      *
      * See https://apitools.dev/swagger-parser/docs/refs.html#pathstypes
      *
      * @param types (optional) Optionally only return certain types of paths ("file", "http", etc.)
      */
    def paths(types: String*): js.Array[String] = js.native
    
    /**
      * Sets the value at the given path in the OpenAPI definition. If the property, or any of its parents, don't exist, they will be created.
      *
      * @param $ref The JSON Reference path, optionally with a JSON Pointer in the hash
      * @param value The value to assign. Can be anything (object, string, number, etc.)
      */
    def set($ref: String, value: js.Any): Unit = js.native
    
    /**
      * Returns a map of paths/URLs and their correspond values.
      *
      * See https://apitools.dev/swagger-parser/docs/refs.html#valuestypes
      *
      * @param types (optional) Optionally only return values from certain locations ("file", "http", etc.)
      */
    def values(types: String*): StringDictionary[js.Any] = js.native
  }
  
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: String): js.Promise[Document] = js.native
  /**
    * Bundles all referenced files/URLs into a single API definition that only has internal `$ref` pointers. This lets you split-up your API definition however you want while you're building it, but easily combine all those files together when it's time to package or distribute the API definition to other people. The resulting API definition size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
    *
    * This also eliminates the risk of circular references, so the API definition can be safely serialized using `JSON.stringify()`.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#bundleapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the bundled API definition object
    */
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: String, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: Document): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: Document, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "bundle")
  @js.native
  def bundle(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: String): js.Promise[Document] = js.native
  /**
    * Dereferences all `$ref` pointers in the OpenAPI definition, replacing each reference with its resolved value. This results in an API definition that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
    *
    * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the API definition using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#dereferenceapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
    */
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: String, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: Document): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: Document, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "dereference")
  @js.native
  def dereference(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: String): js.Promise[Document] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Parses the given OpenAPI definition file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#parseapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the parsed OpenAPI definition object, or an error
    */
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: String, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: Document): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: Document, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "parse")
  @js.native
  def parse(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: String): js.Promise[Refs] = js.native
  /**
    * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
    *
    * Resolves all JSON references (`$ref` pointers) in the given OpenAPI definition file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#resolveapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive a `$Refs` object
    */
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: String, callback: RefsCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: String, options: Options): js.Promise[Refs] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: String, options: Options, callback: RefsCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: Document): js.Promise[Refs] = js.native
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: Document, callback: RefsCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: Document, options: Options): js.Promise[Refs] = js.native
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(api: Document, options: Options, callback: RefsCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(baseUrl: String, api: String, options: Options): js.Promise[Refs] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(baseUrl: String, api: String, options: Options, callback: RefsCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(baseUrl: String, api: Document, options: Options): js.Promise[Refs] = js.native
  @JSImport("@apidevtools/swagger-parser", "resolve")
  @js.native
  def resolve(baseUrl: String, api: Document, options: Options, callback: RefsCallback): Unit = js.native
  
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: String): js.Promise[Document] = js.native
  /**
    * Parses, dereferences, and validates the given Swagger API.
    * Depending on the options, validation can include JSON Schema validation and/or Swagger Spec validation.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#validateapi-options-callback
    *
    * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
    * @param options (optional)
    * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
    */
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: String, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: Document): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: Document, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(api: Document, options: Options, callback: ApiCallback): Unit = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
  /* static member */
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
  @JSImport("@apidevtools/swagger-parser", "validate")
  @js.native
  def validate(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  
  type ApiCallback = js.Function2[/* err */ Error | Null, /* api */ js.UndefOr[Document], js.Any]
  
  @js.native
  trait FileInfo extends StObject {
    
    /**
      * The raw file contents, in whatever form they were returned by the resolver that read the file.
      */
    var data: String | Buffer = js.native
    
    /**
      * The lowercase file extension, such as ".json", ".yaml", ".txt", etc.
      */
    var extension: String = js.native
    
    /**
      * The full URL of the file. This could be any type of URL, including "http://", "https://", "file://", "ftp://", "mongodb://", or even a local filesystem path (when running in Node.js).
      */
    var url: String = js.native
  }
  object FileInfo {
    
    @scala.inline
    def apply(data: String | Buffer, extension: String, url: String): FileInfo = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], extension = extension.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileInfo]
    }
    
    @scala.inline
    implicit class FileInfoMutableBuilder[Self <: FileInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined parent std.Partial<@apidevtools/swagger-parser.@apidevtools/swagger-parser.ResolverOptions> */
  @js.native
  trait HTTPResolverOptions extends StObject {
    
    var canRead: js.UndefOr[
        Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.native
    
    /**
      * You can specify any HTTP headers that should be sent when downloading files. For example, some servers may require you to set the `Accept` or `Referrer` header.
      */
    var headers: js.UndefOr[js.Object] = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    var read: js.UndefOr[
        js.Function2[
          /* file */ FileInfo, 
          /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]], 
          String | Buffer | (js.Promise[String | Buffer])
        ]
      ] = js.native
    
    /**
      * The maximum number of HTTP redirects to follow per file. The default is 5. To disable automatic following of redirects, set this to zero.
      */
    var redirects: js.UndefOr[Double] = js.native
    
    /**
      * The amount of time (in milliseconds) to wait for a response from the server when downloading files. The default is 5 seconds.
      */
    var timeout: js.UndefOr[Double] = js.native
    
    /**
      * Set this to `true` if you're downloading files from a CORS-enabled server that requires authentication
      */
    var withCredentials: js.UndefOr[Boolean] = js.native
  }
  object HTTPResolverOptions {
    
    @scala.inline
    def apply(): HTTPResolverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HTTPResolverOptions]
    }
    
    @scala.inline
    implicit class HTTPResolverOptionsMutableBuilder[Self <: HTTPResolverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanRead(value: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanReadFunction1(value: /* file */ FileInfo => Boolean): Self = StObject.set(x, "canRead", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
      
      @scala.inline
      def setCanReadVarargs(value: String*): Self = StObject.set(x, "canRead", js.Array(value :_*))
      
      @scala.inline
      def setHeaders(value: js.Object): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setRead(
        value: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]]) => String | Buffer | (js.Promise[String | Buffer])
      ): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      @scala.inline
      def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      @scala.inline
      def setRedirects(value: Double): Self = StObject.set(x, "redirects", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectsUndefined: Self = StObject.set(x, "redirects", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      @scala.inline
      def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * The `dereference` options control how JSON Schema `$Ref` Parser will dereference `$ref` pointers within the JSON schema.
      */
    var dereference: js.UndefOr[Circular] = js.native
    
    /**
      * The `parse` options determine how different types of files will be parsed.
      *
      * JSON Schema `$Ref` Parser comes with built-in JSON, YAML, plain-text, and binary parsers, any of which you can configure or disable. You can also add your own custom parsers if you want.
      */
    var parse: js.UndefOr[Dictkey] = js.native
    
    /**
      * The `resolve` options control how Swagger Parser will resolve file paths and URLs, and how those files will be read/downloaded.
      *
      * JSON Schema `$Ref` Parser comes with built-in support for HTTP and HTTPS, as well as support for local files (when running in Node.js). You can configure or disable either of these built-in resolvers. You can also add your own custom resolvers if you want.
      */
    var resolve: js.UndefOr[External] = js.native
    
    /**
      * The `validate` options control how Swagger Parser will validate the API.
      */
    var validate: js.UndefOr[Schema] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDereference(value: Circular): Self = StObject.set(x, "dereference", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDereferenceUndefined: Self = StObject.set(x, "dereference", js.undefined)
      
      @scala.inline
      def setParse(value: Dictkey): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParseUndefined: Self = StObject.set(x, "parse", js.undefined)
      
      @scala.inline
      def setResolve(value: External): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
      
      @scala.inline
      def setValidate(value: Schema): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
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
  }
  object ParserOptions {
    
    @scala.inline
    def apply(): ParserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParserOptions]
    }
    
    @scala.inline
    implicit class ParserOptionsMutableBuilder[Self <: ParserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowEmpty(value: Boolean): Self = StObject.set(x, "allowEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowEmptyUndefined: Self = StObject.set(x, "allowEmpty", js.undefined)
      
      @scala.inline
      def setCanParse(value: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])): Self = StObject.set(x, "canParse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanParseFunction1(value: /* file */ FileInfo => Boolean): Self = StObject.set(x, "canParse", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanParseUndefined: Self = StObject.set(x, "canParse", js.undefined)
      
      @scala.inline
      def setCanParseVarargs(value: String*): Self = StObject.set(x, "canParse", js.Array(value :_*))
      
      @scala.inline
      def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    }
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
      * The order property and canRead property are related to each other. For each file that Swagger Parser needs to resolve, it first determines which resolvers can read that file by checking their canRead property. If only one resolver matches a file, then only that one resolver is called, regardless of its order. If multiple resolvers match a file, then those resolvers are tried in order until one of them successfully reads the file. Once a resolver successfully reads the file, the rest of the resolvers are skipped.
      */
    var order: js.UndefOr[Double] = js.native
    
    /**
      * This is where the real work of a resolver happens. The `read` method accepts the same file info object as the `canRead` function, but rather than returning a boolean value, the `read` method should return the contents of the file. The file contents should be returned in as raw a form as possible, such as a string or a byte array. Any further parsing or processing should be done by parsers.
      *
      * Unlike the `canRead` function, the `read` method can also be asynchronous. This might be important if your resolver needs to read data from a database or some other external source. You can return your asynchronous value using either an ES6 Promise or a Node.js-style error-first callback. Of course, if your resolver has the ability to return its data synchronously, then that's fine too. Here are examples of all three approaches:
      */
    def read(file: FileInfo): String | Buffer | (js.Promise[String | Buffer]) = js.native
    def read(file: FileInfo, callback: js.Function2[/* error */ Error | Null, /* data */ String | Null, _]): String | Buffer | (js.Promise[String | Buffer]) = js.native
  }
  
  /**
    * This is the default export of Swagger Parser. You can creates instances of this class using new SwaggerParser(), or you can just call its static methods.
    *
    * See https://apitools.dev/swagger-parser/docs/swagger-parser.html
    */
  @js.native
  trait SwaggerParser extends StObject {
    
    /**
      * The $refs property is a `$Refs` object, which lets you access all of the externally-referenced files in the OpenAPI definition, as well as easily get and set specific values in the OpenAPI definition using JSON pointers.
      *
      * This is the same value that is passed to the callback function (or Promise) when calling the `resolve` method.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#refs
      */
    @JSName("$refs")
    var $refs: Refs = js.native
    
    /**
      * The `api` property is the parsed/bundled/dereferenced OpenAPI definition. This is the same value that is passed to the callback function (or Promise) when calling the parse, bundle, or dereference methods.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#api
      */
    var api: Document = js.native
    
    def bundle(api: String): js.Promise[Document] = js.native
    /**
      * Bundles all referenced files/URLs into a single API definition that only has internal `$ref` pointers. This lets you split-up your API definition however you want while you're building it, but easily combine all those files together when it's time to package or distribute the API definition to other people. The resulting API definition size will be small, since it will still contain internal JSON references rather than being fully-dereferenced.
      *
      * This also eliminates the risk of circular references, so the API definition can be safely serialized using `JSON.stringify()`.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#bundleapi-options-callback
      *
      * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the bundled API definition object
      */
    def bundle(api: String, callback: ApiCallback): Unit = js.native
    def bundle(api: String, options: Options): js.Promise[Document] = js.native
    def bundle(api: String, options: Options, callback: ApiCallback): Unit = js.native
    def bundle(api: Document): js.Promise[Document] = js.native
    def bundle(api: Document, callback: ApiCallback): Unit = js.native
    def bundle(api: Document, options: Options): js.Promise[Document] = js.native
    def bundle(api: Document, options: Options, callback: ApiCallback): Unit = js.native
    def bundle(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
    def bundle(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
    def bundle(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
    def bundle(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
    
    def dereference(api: String): js.Promise[Document] = js.native
    /**
      * Dereferences all `$ref` pointers in the OpenAPI definition, replacing each reference with its resolved value. This results in an API definition that does not contain any `$ref` pointers. Instead, it's a normal JavaScript object tree that can easily be crawled and used just like any other JavaScript object. This is great for programmatic usage, especially when using tools that don't understand JSON references.
      *
      * The dereference method maintains object reference equality, meaning that all `$ref` pointers that point to the same object will be replaced with references to the same object. Again, this is great for programmatic usage, but it does introduce the risk of circular references, so be careful if you intend to serialize the API definition using `JSON.stringify()`. Consider using the bundle method instead, which does not create circular references.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#dereferenceapi-options-callback
      *
      * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
      */
    def dereference(api: String, callback: ApiCallback): Unit = js.native
    def dereference(api: String, options: Options): js.Promise[Document] = js.native
    def dereference(api: String, options: Options, callback: ApiCallback): Unit = js.native
    def dereference(api: Document): js.Promise[Document] = js.native
    def dereference(api: Document, callback: ApiCallback): Unit = js.native
    def dereference(api: Document, options: Options): js.Promise[Document] = js.native
    def dereference(api: Document, options: Options, callback: ApiCallback): Unit = js.native
    def dereference(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
    def dereference(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
    def dereference(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
    def dereference(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
    
    def parse(api: String): js.Promise[Document] = js.native
    /**
      * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
      *
      * Parses the given OpenAPI definition file (in JSON or YAML format), and returns it as a JavaScript object. This method `does not` resolve `$ref` pointers or dereference anything. It simply parses one file and returns it.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#parseapi-options-callback
      *
      * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. The path can be absolute or relative. In Node, the path is relative to `process.cwd()`. In the browser, it's relative to the URL of the page.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the parsed OpenAPI definition object, or an error
      */
    def parse(api: String, callback: ApiCallback): Unit = js.native
    def parse(api: String, options: Options): js.Promise[Document] = js.native
    def parse(api: String, options: Options, callback: ApiCallback): Unit = js.native
    def parse(api: Document): js.Promise[Document] = js.native
    def parse(api: Document, callback: ApiCallback): Unit = js.native
    def parse(api: Document, options: Options): js.Promise[Document] = js.native
    def parse(api: Document, options: Options, callback: ApiCallback): Unit = js.native
    def parse(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
    def parse(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
    def parse(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
    def parse(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
    
    def resolve(api: String): js.Promise[Refs] = js.native
    /**
      * *This method is used internally by other methods, such as `bundle` and `dereference`. You probably won't need to call this method yourself.*
      *
      * Resolves all JSON references (`$ref` pointers) in the given OpenAPI definition file. If it references any other files/URLs, then they will be downloaded and resolved as well. This method **does not** dereference anything. It simply gives you a `$Refs` object, which is a map of all the resolved references and their values.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#resolveapi-options-callback
      *
      * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive a `$Refs` object
      */
    def resolve(api: String, callback: RefsCallback): Unit = js.native
    def resolve(api: String, options: Options): js.Promise[Refs] = js.native
    def resolve(api: String, options: Options, callback: RefsCallback): Unit = js.native
    def resolve(api: Document): js.Promise[Refs] = js.native
    def resolve(api: Document, callback: RefsCallback): Unit = js.native
    def resolve(api: Document, options: Options): js.Promise[Refs] = js.native
    def resolve(api: Document, options: Options, callback: RefsCallback): Unit = js.native
    def resolve(baseUrl: String, api: String, options: Options): js.Promise[Refs] = js.native
    def resolve(baseUrl: String, api: String, options: Options, callback: RefsCallback): Unit = js.native
    def resolve(baseUrl: String, api: Document, options: Options): js.Promise[Refs] = js.native
    def resolve(baseUrl: String, api: Document, options: Options, callback: RefsCallback): Unit = js.native
    
    def validate(api: String): js.Promise[Document] = js.native
    /**
      * Parses, dereferences, and validates the given Swagger API.
      * Depending on the options, validation can include JSON Schema validation and/or Swagger Spec validation.
      *
      * See https://apitools.dev/swagger-parser/docs/swagger-parser.html#validateapi-options-callback
      *
      * @param api An OpenAPI definition, or the file path or URL of an OpenAPI definition. See the `parse` method for more info.
      * @param options (optional)
      * @param callback (optional) A callback that will receive the dereferenced OpenAPI definition
      */
    def validate(api: String, callback: ApiCallback): Unit = js.native
    def validate(api: String, options: Options): js.Promise[Document] = js.native
    def validate(api: String, options: Options, callback: ApiCallback): Unit = js.native
    def validate(api: Document): js.Promise[Document] = js.native
    def validate(api: Document, callback: ApiCallback): Unit = js.native
    def validate(api: Document, options: Options): js.Promise[Document] = js.native
    def validate(api: Document, options: Options, callback: ApiCallback): Unit = js.native
    def validate(baseUrl: String, api: String, options: Options): js.Promise[Document] = js.native
    def validate(baseUrl: String, api: String, options: Options, callback: ApiCallback): Unit = js.native
    def validate(baseUrl: String, api: Document, options: Options): js.Promise[Document] = js.native
    def validate(baseUrl: String, api: Document, options: Options, callback: ApiCallback): Unit = js.native
  }
}
