package typings.apidevtoolsJsonSchemaRefParser

import org.scalablytyped.runtime.StringDictionary
import typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.ignore
import typings.apidevtoolsJsonSchemaRefParser.mod.FileInfo
import typings.apidevtoolsJsonSchemaRefParser.mod.HTTPResolverOptions
import typings.apidevtoolsJsonSchemaRefParser.mod.JSONSchema
import typings.apidevtoolsJsonSchemaRefParser.mod.ParserOptions
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Circular extends StObject {
    
    /**
      * Determines whether circular `$ref` pointers are handled.
      *
      * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
      *
      * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
      */
    var circular: js.UndefOr[Boolean | ignore] = js.undefined
  }
  object Circular {
    
    inline def apply(): Circular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Circular]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Circular] (val x: Self) extends AnyVal {
      
      inline def setCircular(value: Boolean | ignore): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      inline def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    }
  }
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
    
    var json: js.UndefOr[ParserOptions | Boolean] = js.undefined
    
    var text: js.UndefOr[ParserOptionsencodingstri | Boolean] = js.undefined
    
    var yaml: js.UndefOr[ParserOptions | Boolean] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setJson(value: ParserOptions | Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      inline def setText(value: ParserOptionsencodingstri | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setYaml(value: ParserOptions | Boolean): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
      
      inline def setYamlUndefined: Self = StObject.set(x, "yaml", js.undefined)
    }
  }
  
  trait External
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[PartialResolverOptions | HTTPResolverOptions | Boolean]] {
    
    /**
      * Determines whether external $ref pointers will be resolved. If this option is disabled, then external `$ref` pointers will simply be ignored.
      */
    var external: js.UndefOr[Boolean] = js.undefined
    
    var file: js.UndefOr[PartialResolverOptions | Boolean] = js.undefined
    
    var http: js.UndefOr[HTTPResolverOptions | Boolean] = js.undefined
  }
  object External {
    
    inline def apply(): External = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      inline def setFile(value: PartialResolverOptions | Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setHttp(value: HTTPResolverOptions | Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    }
  }
  
  /* Inlined @apidevtools/json-schema-ref-parser.@apidevtools/json-schema-ref-parser.ParserOptions & {  encoding :string | undefined} */
  @js.native
  trait ParserOptionsencodingstri extends StObject {
    
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
        Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.native
    
    var encoding: js.UndefOr[String] = js.native
    
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
    def parse(file: FileInfo): Any | js.Promise[Any] = js.native
    def parse(file: FileInfo, callback: js.Function2[/* error */ js.Error | Null, /* data */ String | Null, Any]): Any | js.Promise[Any] = js.native
  }
  
  /* Inlined std.Partial<@apidevtools/json-schema-ref-parser.@apidevtools/json-schema-ref-parser.ResolverOptions> */
  trait PartialResolverOptions extends StObject {
    
    var canRead: js.UndefOr[
        Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.undefined
    
    var order: js.UndefOr[Double] = js.undefined
    
    var read: js.UndefOr[
        js.Function2[
          /* file */ FileInfo, 
          /* callback */ js.UndefOr[js.Function2[/* error */ js.Error | Null, /* data */ String | Null, Any]], 
          String | Buffer | JSONSchema | (js.Promise[String | Buffer | JSONSchema])
        ]
      ] = js.undefined
  }
  object PartialResolverOptions {
    
    inline def apply(): PartialResolverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialResolverOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialResolverOptions] (val x: Self) extends AnyVal {
      
      inline def setCanRead(
        value: Boolean | js.RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
      
      inline def setCanReadFunction1(value: /* file */ FileInfo => Boolean): Self = StObject.set(x, "canRead", js.Any.fromFunction1(value))
      
      inline def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
      
      inline def setCanReadVarargs(value: String*): Self = StObject.set(x, "canRead", js.Array(value*))
      
      inline def setOrder(value: Double): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      inline def setRead(
        value: (/* file */ FileInfo, /* callback */ js.UndefOr[js.Function2[/* error */ js.Error | Null, /* data */ String | Null, Any]]) => String | Buffer | JSONSchema | (js.Promise[String | Buffer | JSONSchema])
      ): Self = StObject.set(x, "read", js.Any.fromFunction2(value))
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
    }
  }
}
