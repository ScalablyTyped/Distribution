package typings
package activexDashMsxml2Lib.MSXML2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DOMNodeType extends js.Object

/** Constants that define a node's type */
@JSGlobal("MSXML2.DOMNodeType")
@js.native
object DOMNodeType extends js.Object {
  @js.native
  sealed trait NODE_ATTRIBUTE
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_CDATA_SECTION
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_COMMENT
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_DOCUMENT
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_DOCUMENT_FRAGMENT
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_DOCUMENT_TYPE
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_ELEMENT
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_ENTITY
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_ENTITY_REFERENCE
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_INVALID
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_NOTATION
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_PROCESSING_INSTRUCTION
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  @js.native
  sealed trait NODE_TEXT
    extends activexDashMsxml2Lib.MSXML2Ns.DOMNodeType
  
  /* 2 */ val NODE_ATTRIBUTE: NODE_ATTRIBUTE with scala.Double = js.native
  /* 4 */ val NODE_CDATA_SECTION: NODE_CDATA_SECTION with scala.Double = js.native
  /* 8 */ val NODE_COMMENT: NODE_COMMENT with scala.Double = js.native
  /* 9 */ val NODE_DOCUMENT: NODE_DOCUMENT with scala.Double = js.native
  /* 11 */ val NODE_DOCUMENT_FRAGMENT: NODE_DOCUMENT_FRAGMENT with scala.Double = js.native
  /* 10 */ val NODE_DOCUMENT_TYPE: NODE_DOCUMENT_TYPE with scala.Double = js.native
  /* 1 */ val NODE_ELEMENT: NODE_ELEMENT with scala.Double = js.native
  /* 6 */ val NODE_ENTITY: NODE_ENTITY with scala.Double = js.native
  /* 5 */ val NODE_ENTITY_REFERENCE: NODE_ENTITY_REFERENCE with scala.Double = js.native
  /* 0 */ val NODE_INVALID: NODE_INVALID with scala.Double = js.native
  /* 12 */ val NODE_NOTATION: NODE_NOTATION with scala.Double = js.native
  /* 7 */ val NODE_PROCESSING_INSTRUCTION: NODE_PROCESSING_INSTRUCTION with scala.Double = js.native
  /* 3 */ val NODE_TEXT: NODE_TEXT with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashMsxml2Lib.MSXML2Ns.DOMNodeType with scala.Double] = js.native
}

