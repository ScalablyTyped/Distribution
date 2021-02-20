package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.treeTreeMod.TreeProps
import typings.rcTree.interfaceMod.Key
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object directoryTreeMod extends Shortcut {
  
  @JSImport("antd/lib/tree/DirectoryTree", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[DirectoryTreeProps with RefAttributes[typings.rcTree.mod.default]] = js.native
  
  @js.native
  trait DirectoryTreeProps extends TreeProps {
    
    var expandAction: js.UndefOr[ExpandAction] = js.native
  }
  object DirectoryTreeProps {
    
    @scala.inline
    def apply(): DirectoryTreeProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeProps]
    }
    
    @scala.inline
    implicit class DirectoryTreePropsMutableBuilder[Self <: DirectoryTreeProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandAction(value: ExpandAction): Self = StObject.set(x, "expandAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandActionUndefined: Self = StObject.set(x, "expandAction", js.undefined)
    }
  }
  
  @js.native
  trait DirectoryTreeState extends StObject {
    
    var expandedKeys: js.UndefOr[js.Array[Key]] = js.native
    
    var selectedKeys: js.UndefOr[js.Array[Key]] = js.native
  }
  object DirectoryTreeState {
    
    @scala.inline
    def apply(): DirectoryTreeState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectoryTreeState]
    }
    
    @scala.inline
    implicit class DirectoryTreeStateMutableBuilder[Self <: DirectoryTreeState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExpandedKeys(value: js.Array[Key]): Self = StObject.set(x, "expandedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpandedKeysUndefined: Self = StObject.set(x, "expandedKeys", js.undefined)
      
      @scala.inline
      def setExpandedKeysVarargs(value: Key*): Self = StObject.set(x, "expandedKeys", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[Key]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysUndefined: Self = StObject.set(x, "selectedKeys", js.undefined)
      
      @scala.inline
      def setSelectedKeysVarargs(value: Key*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdBooleans.`false`
    - typings.antd.antdStrings.click
    - typings.antd.antdStrings.doubleClick
  */
  trait ExpandAction extends StObject
  object ExpandAction {
    
    @scala.inline
    def click: typings.antd.antdStrings.click = "click".asInstanceOf[typings.antd.antdStrings.click]
    
    @scala.inline
    def doubleClick: typings.antd.antdStrings.doubleClick = "doubleClick".asInstanceOf[typings.antd.antdStrings.doubleClick]
    
    @scala.inline
    def `false`: typings.antd.antdBooleans.`false` = false.asInstanceOf[typings.antd.antdBooleans.`false`]
  }
  
  type _To = ForwardRefExoticComponent[DirectoryTreeProps with RefAttributes[typings.rcTree.mod.default]]
  
  /* This means you don't have to write `default`, but can instead just say `directoryTreeMod.foo` */
  override def _to: ForwardRefExoticComponent[DirectoryTreeProps with RefAttributes[typings.rcTree.mod.default]] = default
}
