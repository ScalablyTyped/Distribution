package typings.atlaskitTree

import typings.atlaskitTree.treeItemTypesMod._DragActionType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object atlaskitTreeStrings {
  
  @js.native
  sealed trait key
    extends StObject
       with _DragActionType
  inline def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait mouse
    extends StObject
       with _DragActionType
  inline def mouse: mouse = "mouse".asInstanceOf[mouse]
  
  @js.native
  sealed trait none extends StObject
  inline def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait touch
    extends StObject
       with _DragActionType
  inline def touch: touch = "touch".asInstanceOf[touch]
}
