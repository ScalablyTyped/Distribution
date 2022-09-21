package typings.atvlegacycontentkit.atv

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The type used for Apple TV documents, equivalent to Document in the normal DOM.
  */
@js.native
trait Document
  extends StObject
     with Node {
  
  /**
    * Get elements that match the supplied xpath.
    * @param xpath The xpath to query.
    * @param parentNode Optionally, the node that you want the xpath to be limited to (e.g. for descendants queries).
    */
  def evaluateXPath(xpath: String): Element = js.native
  def evaluateXPath(xpath: String, parentNode: Node): Element = js.native
  
  /**
    * Get an element by its ID
    * @param id The ID of the element you wish to find.
    */
  def getElementById(id: String): Element = js.native
  
  /**
    * Make a new element with the tag name supplied.
    * @param name The tag name you want to give the new element.
    */
  def makeElementNamed(name: String): Element = js.native
  
  /**
    * The root element of this document.
    */
  val rootElement: Element = js.native
  
  /**
    * Serialize the document to an XML string.
    */
  def serializeToString(): String = js.native
}
