package typings.angularCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TNodeFlags {
  
  /** Bit #4 - This bit is set if the node has any "class" inputs */
  inline def hasClassInput: 8 = 8.asInstanceOf[8]
  
  /** Bit #3 - This bit is set if any directive on this node has content queries */
  inline def hasContentQuery: 4 = 4.asInstanceOf[4]
  
  /**
    * Bit #7 - This bit is set if the node has directives with host bindings.
    *
    * This flags allows us to guard host-binding logic and invoke it only on nodes
    * that actually have directives with host bindings.
    */
  inline def hasHostBindings: 64 = 64.asInstanceOf[64]
  
  /** Bit #5 - This bit is set if the node has any "style" inputs */
  inline def hasStyleInput: 16 = 16.asInstanceOf[16]
  
  /** Bit #6 This bit is set if the node has been detached by i18n */
  inline def isDetached: 32 = 32.asInstanceOf[32]
  
  /** Bit #1 - This bit is set if the node is a host for any directive (including a component) */
  inline def isDirectiveHost: 1 = 1.asInstanceOf[1]
  
  /** Bit #2 - This bit is set if the node has been projected */
  inline def isProjected: 2 = 2.asInstanceOf[2]
}
