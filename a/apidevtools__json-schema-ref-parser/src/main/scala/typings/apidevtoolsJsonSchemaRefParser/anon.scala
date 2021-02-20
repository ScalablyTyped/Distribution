package typings.apidevtoolsJsonSchemaRefParser

import org.scalablytyped.runtime.StringDictionary
import typings.apidevtoolsJsonSchemaRefParser.apidevtoolsJsonSchemaRefParserStrings.ignore
import typings.apidevtoolsJsonSchemaRefParser.mod.FileInfo
import typings.apidevtoolsJsonSchemaRefParser.mod.HTTPResolverOptions
import typings.apidevtoolsJsonSchemaRefParser.mod.ParserOptions
import typings.node.Buffer
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Circular extends StObject {
    
    /**
      * Determines whether circular `$ref` pointers are handled.
      *
      * If set to `false`, then a `ReferenceError` will be thrown if the schema contains any circular references.
      *
      * If set to `"ignore"`, then circular references will simply be ignored. No error will be thrown, but the `$Refs.circular` property will still be set to `true`.
      */
    var circular: js.UndefOr[Boolean | ignore] = js.native
  }
  object Circular {
    
    @scala.inline
    def apply(): Circular = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Circular]
    }
    
    @scala.inline
    implicit class CircularMutableBuilder[Self <: Circular] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCircular(value: Boolean | ignore): Self = StObject.set(x, "circular", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCircularUndefined: Self = StObject.set(x, "circular", js.undefined)
    }
  }
  
  @js.native
  trait Dictkey
    extends /* key */ StringDictionary[js.UndefOr[ParserOptions | Boolean]] {
    
    var json: js.UndefOr[ParserOptions | Boolean] = js.native
    
    var text: js.UndefOr[ParserOptionsencodingstri | Boolean] = js.native
    
    var yaml: js.UndefOr[ParserOptions | Boolean] = js.native
  }
  object Dictkey {
    
    @scala.inline
    def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit class DictkeyMutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setJson(value: ParserOptions | Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
      
      @scala.inline
      def setText(value: ParserOptionsencodingstri | Boolean): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setYaml(value: ParserOptions | Boolean): Self = StObject.set(x, "yaml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYamlUndefined: Self = StObject.set(x, "yaml", js.undefined)
    }
  }
  
  @js.native
  trait External extends /* key */ StringDictionary[PartialResolverOptions] {
    
    /**
      * Determines whether external $ref pointers will be resolved. If this option is disabled, then external `$ref` pointers will simply be ignored.
      */
    var external: js.UndefOr[Boolean] = js.native
    
    var file: js.UndefOr[PartialResolverOptions | Boolean] = js.native
    
    var http: js.UndefOr[HTTPResolverOptions | Boolean] = js.native
  }
  object External {
    
    @scala.inline
    def apply(): External = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[External]
    }
    
    @scala.inline
    implicit class ExternalMutableBuilder[Self <: External] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExternalUndefined: Self = StObject.set(x, "external", js.undefined)
      
      @scala.inline
      def setFile(value: PartialResolverOptions | Boolean): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      @scala.inline
      def setHttp(value: HTTPResolverOptions | Boolean): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
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
        Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
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
    def parse(file: FileInfo): js.Any | js.Promise[_] = js.native
    def parse(file: FileInfo, callback: js.Function2[/* error */ Error | Null, /* data */ String | Null, _]): js.Any | js.Promise[_] = js.native
  }
  
  /* Inlined std.Partial<@apidevtools/json-schema-ref-parser.@apidevtools/json-schema-ref-parser.ResolverOptions> */
  @js.native
  trait PartialResolverOptions extends StObject {
    
    var canRead: js.UndefOr[
        Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])
      ] = js.native
    
    var order: js.UndefOr[Double] = js.native
    
    var read: js.UndefOr[
        js.Function2[
          /* file */ FileInfo, 
          /* callback */ js.UndefOr[js.Function2[/* error */ Error | Null, /* data */ String | Null, _]], 
          String | Buffer | (js.Promise[String | Buffer])
        ]
      ] = js.native
  }
  object PartialResolverOptions {
    
    @scala.inline
    def apply(): PartialResolverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialResolverOptions]
    }
    
    @scala.inline
    implicit class PartialResolverOptionsMutableBuilder[Self <: PartialResolverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCanRead(value: Boolean | RegExp | String | js.Array[String] | (js.Function1[/* file */ FileInfo, Boolean])): Self = StObject.set(x, "canRead", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCanReadFunction1(value: /* file */ FileInfo => Boolean): Self = StObject.set(x, "canRead", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCanReadUndefined: Self = StObject.set(x, "canRead", js.undefined)
      
      @scala.inline
      def setCanReadVarargs(value: String*): Self = StObject.set(x, "canRead", js.Array(value :_*))
      
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
    }
  }
}
