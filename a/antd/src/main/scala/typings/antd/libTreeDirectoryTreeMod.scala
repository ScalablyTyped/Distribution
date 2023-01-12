package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.`3`
import typings.antd.anon.`5`
import typings.antd.libTreeTreeMod.TreeProps
import typings.rcTree.esInterfaceMod.BasicDataNode
import typings.rcTree.esInterfaceMod.DataNode
import typings.rcTree.esInterfaceMod.Key
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTreeDirectoryTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  val default: DirectoryTreeCompoundedComponent = js.native
  
  type DirectoryTreeCompoundedComponent = (js.Function1[/* props */ PropsWithChildren[DirectoryTreeProps[DataNode]] & `5`, ReactElement]) & `3`
  
  trait DirectoryTreeProps[T /* <: BasicDataNode */]
    extends StObject
       with TreeProps[T] {
    
    @JSName("expandAction")
    var expandAction_DirectoryTreeProps: js.UndefOr[ExpandAction] = js.undefined
  }
  object DirectoryTreeProps {
    
    inline def apply[T /* <: BasicDataNode */](): DirectoryTreeProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeProps[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryTreeProps[?], T /* <: BasicDataNode */] (val x: Self & DirectoryTreeProps[T]) extends AnyVal {
      
      inline def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      inline def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
    }
  }
  
  trait DirectoryTreeState extends StObject {
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.undefined
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
  }
  object DirectoryTreeState {
    
    inline def apply(): DirectoryTreeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectoryTreeState] (val x: Self) extends AnyVal {
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value*))
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdBooleans.`false`
    - typings.antd.antdStrings.click
    - typings.antd.antdStrings.doubleClick
  */
  trait ExpandAction extends StObject
  object ExpandAction {
    
    inline def click: typings.antd.antdStrings.click = "click".asInstanceOf[typings.antd.antdStrings.click]
    
    inline def doubleClick: typings.antd.antdStrings.doubleClick = "doubleClick".asInstanceOf[typings.antd.antdStrings.doubleClick]
    
    inline def `false`: typings.antd.antdBooleans.`false` = false.asInstanceOf[typings.antd.antdBooleans.`false`]
  }
  
  type _To = DirectoryTreeCompoundedComponent
  
  /* This means you don't have to write `default`, but can instead just say `libTreeDirectoryTreeMod.foo` */
  override def _to: DirectoryTreeCompoundedComponent = default
}
