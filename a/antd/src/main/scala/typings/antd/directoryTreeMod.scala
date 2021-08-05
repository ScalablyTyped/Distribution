package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.treeTreeMod.TreeProps
import typings.rcTree.interfaceMod.Key
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DirectoryTreeProps & RefAttributes[typings.rcTree.mod.default]] = js.native
  
  trait DirectoryTreeProps
    extends StObject
       with TreeProps {
    
    var expandAction: js.UndefOr[ExpandAction] = js.undefined
  }
  object DirectoryTreeProps {
    
    inline def apply(): DirectoryTreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeProps]
    }
    
    extension [Self <: DirectoryTreeProps](x: Self) {
      
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
    
    extension [Self <: DirectoryTreeState](x: Self) {
      
      inline def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      inline def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      inline def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      inline def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
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
  
  type _To = ForwardRefExoticComponent[DirectoryTreeProps & RefAttributes[typings.rcTree.mod.default]]
  
  /* This means you don't have to write `default`, but can instead just say `directoryTreeMod.foo` */
  override def _to: ForwardRefExoticComponent[DirectoryTreeProps & RefAttributes[typings.rcTree.mod.default]] = default
}
