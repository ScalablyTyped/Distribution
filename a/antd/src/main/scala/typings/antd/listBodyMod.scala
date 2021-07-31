package typings.antd

import typings.antd.anon.Current
import typings.antd.antdStrings.checkedKeys
import typings.antd.antdStrings.handleClear
import typings.antd.antdStrings.handleFilter
import typings.antd.transferListMod.RenderedItem
import typings.antd.transferListMod.TransferListProps
import typings.antd.transferMod.KeyWiseTransferItem
import typings.antd.typeMod.ElementOf
import typings.antd.typeMod.Omit
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listBodyMod {
  
  @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
  @js.native
  class default[RecordType /* <: KeyWiseTransferItem */] () extends ListBody[RecordType]
  object default {
    
    @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @scala.inline
    def getDerivedStateFromProps[T](hasFilteredRenderItemsPagination: TransferListBodyProps[T], hasCurrent: TransferListBodyState): Current | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasFilteredRenderItemsPagination.asInstanceOf[js.Any], hasCurrent.asInstanceOf[js.Any])).asInstanceOf[Current | Null]
  }
  
  @JSImport("antd/lib/transfer/ListBody", "OmitProps")
  @js.native
  val OmitProps: js.Tuple3[handleFilter, handleClear, checkedKeys] = js.native
  
  @js.native
  trait ListBody[RecordType /* <: KeyWiseTransferItem */]
    extends Component[TransferListBodyProps[RecordType], TransferListBodyState, js.Any] {
    
    def getItems(): js.Array[RenderedItem[RecordType]] = js.native
    
    def onItemRemove(item: RecordType): Unit = js.native
    
    def onItemSelect(item: RecordType): Unit = js.native
    
    def onPageChange(current: Double): Unit = js.native
    
    @JSName("state")
    var state_ListBody: Current = js.native
  }
  
  type OmitProp = ElementOf[js.Tuple3[handleFilter, handleClear, checkedKeys]]
  
  type PartialTransferListProps[RecordType] = Omit[TransferListProps[RecordType], OmitProp]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps<RecordType>, antd.antd/lib/transfer/ListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps<RecordType>[P]} */ trait TransferListBodyProps[RecordType] extends StObject {
    
    var filteredItems: js.Array[RecordType]
    
    var filteredRenderItems: js.Array[RenderedItem[RecordType]]
    
    var selectedKeys: js.Array[String]
  }
  object TransferListBodyProps {
    
    @scala.inline
    def apply[RecordType](
      filteredItems: js.Array[RecordType],
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      selectedKeys: js.Array[String]
    ): TransferListBodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyProps[RecordType]]
    }
    
    @scala.inline
    implicit class TransferListBodyPropsMutableBuilder[Self <: TransferListBodyProps[?], RecordType] (val x: Self & TransferListBodyProps[RecordType]) extends AnyVal {
      
      @scala.inline
      def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value :_*))
      
      @scala.inline
      def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "filteredRenderItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "filteredRenderItems", js.Array(value :_*))
      
      @scala.inline
      def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value :_*))
    }
  }
  
  trait TransferListBodyState extends StObject {
    
    var current: Double
  }
  object TransferListBodyState {
    
    @scala.inline
    def apply(current: Double): TransferListBodyState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyState]
    }
    
    @scala.inline
    implicit class TransferListBodyStateMutableBuilder[Self <: TransferListBodyState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
