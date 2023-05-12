package typings.akamaiEdgeworkers

import typings.akamaiEdgeworkers.streamsMod.ReadableStream
import typings.akamaiEdgeworkers.streamsMod.WritableStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HtmlRewriter rewrites HTML documents by parsing and constructing the DOM.
  * It allows for registering callbacks on CSS selectors that execute when
  * the parser encounters an element matching the selector, enabling modification
  * of tag attributes, insertion of new content around the element, or removal of the element.
  */
object htmlRewriterMod {
  
  @JSImport("html-rewriter", "HtmlRewritingStream")
  @js.native
  /**
    * Constructor for a new HtmlRewritingStream object
    */
  open class HtmlRewritingStream ()
    extends StObject
       with GenericHtmlRewritingStream {
    
    /**
      * Add one or more handlers using onElement(). The handlers call functions on their argument to modify the stream.
      * @param selector is a string CSS selector that specifies when the handler should run.
      * @param handler is a function that runs when the selector matches.
      * When the HtmlRewritingStream calls the handler, it passes an Element object as an argument.
      */
    def onElement(selector: String, handler: js.Function1[/* element */ Element, Unit]): Unit = js.native
    
    /* CompleteClass */
    override val readable: ReadableStream[Any] = js.native
    
    /* CompleteClass */
    override val writable: WritableStream[Any] = js.native
  }
  
  /**
    * The Element object is an argument to the handler registered with onElement(),
    * the handler calls functions on the Element to modify the output stream.
    */
  @js.native
  trait Element extends StObject {
    
    /**
      * Insert new content immediately after the end tag of the matched element.
      * @param text is the new text to insert.
      * @param trailing_opt controls whether elements missing a close tag should have one inserted.
      */
    def after(text: String): Unit = js.native
    def after(text: String, trailing_opt: TrailingOpt): Unit = js.native
    
    /**
      * Insert content right before the end tag of the element.
      * @param text is the new text to insert.
      * @param trailing_opt controls whether elements missing a close tag should have one inserted.
      */
    def append(text: String): Unit = js.native
    def append(text: String, trailing_opt: TrailingOpt): Unit = js.native
    
    /**
      * Insert new content immediately before the start tag of the matched element.
      * @param text is the new text to insert.
      */
    def before(text: String): Unit = js.native
    
    /**
      * Read the value of a given attribute name on the tag or undefined if it doesn’t exist.
      * @param text is the case-insensitive name of the attribute.
      */
    def getAttribute(text: String): js.UndefOr[String] = js.native
    
    /**
      * Insert content right after the start tag of the element.
      * @param text is the new text to insert.
      */
    def prepend(text: String): Unit = js.native
    
    /**
      * Removes the attribute if exists.
      * @param text is the case-insensitive name of the attribute. If an attribute was removed, it is returned.
      */
    def removeAttribute(text: String): js.UndefOr[String] = js.native
    
    /**
      * Remove the children of the current element and insert content in place of them.
      * @param text is the text to replace.
      * @param trailing_opt controls whether elements missing a close tag should have one inserted.
      */
    def replaceChildren(text: String): Unit = js.native
    def replaceChildren(text: String, trailing_opt: TrailingOpt): Unit = js.native
    
    /**
      * Remove the current element and its children, and insert the passed content in its place.
      * @param text is the text to replace.
      */
    def replaceWith(text: String): Unit = js.native
    
    /**
      * Set an attribute to a provided value, creating the attribute if it doesn't exist.
      * @param name is case-insensitive string.
      * @param value is the attribute value of `name`.
      * @param quote_opt is an optional third argument that controls how quotes are applied to the attribute value.
      * It must include a property named quote, whose value is a string containing either a single or double quote.
      */
    def setAttribute(name: String, value: String): Unit = js.native
    def setAttribute(name: String, value: String, quote_opt: QuoteOpt): Unit = js.native
  }
  
  trait GenericHtmlRewritingStream extends StObject {
    
    val readable: ReadableStream[Any]
    
    val writable: WritableStream[Any]
  }
  object GenericHtmlRewritingStream {
    
    inline def apply(readable: ReadableStream[Any], writable: WritableStream[Any]): GenericHtmlRewritingStream = {
      val __obj = js.Dynamic.literal(readable = readable.asInstanceOf[js.Any], writable = writable.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenericHtmlRewritingStream]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenericHtmlRewritingStream] (val x: Self) extends AnyVal {
      
      inline def setReadable(value: ReadableStream[Any]): Self = StObject.set(x, "readable", value.asInstanceOf[js.Any])
      
      inline def setWritable(value: WritableStream[Any]): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * QuoteOpt is an optional third argument that controls how quotes are applied to the attribute value.
    */
  trait QuoteOpt extends StObject {
    
    /**
      * `quote` is a value is a string containing either a single or double quote.
      */
    val quote: String
  }
  object QuoteOpt {
    
    inline def apply(quote: String): QuoteOpt = {
      val __obj = js.Dynamic.literal(quote = quote.asInstanceOf[js.Any])
      __obj.asInstanceOf[QuoteOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuoteOpt] (val x: Self) extends AnyVal {
      
      inline def setQuote(value: String): Self = StObject.set(x, "quote", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * If `TrailingOpt` argument is present, the options object must include a property named `insert_implicit_close`
    * with a boolean value.
    */
  trait TrailingOpt extends StObject {
    
    /**
      * When `insert_implicit_close` is true, elements that are missing a close tag will have one inserted.
      */
    val insert_implicit_close: Boolean
  }
  object TrailingOpt {
    
    inline def apply(insert_implicit_close: Boolean): TrailingOpt = {
      val __obj = js.Dynamic.literal(insert_implicit_close = insert_implicit_close.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrailingOpt]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TrailingOpt] (val x: Self) extends AnyVal {
      
      inline def setInsert_implicit_close(value: Boolean): Self = StObject.set(x, "insert_implicit_close", value.asInstanceOf[js.Any])
    }
  }
}
