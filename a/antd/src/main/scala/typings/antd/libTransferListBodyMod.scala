package typings.antd

import typings.antd.anon.Current
import typings.antd.libTransferListMod.RenderedItem
import typings.antd.libTransferListMod.TransferListProps
import typings.antd.libTransferMod.KeyWiseTransferItem
import typings.antd.libUtilTypeMod.ElementOf
import typings.react.mod.Component
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransferListBodyMod {
  
  @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
  @js.native
  open class default[RecordType /* <: KeyWiseTransferItem */] () extends ListBody[RecordType]
  object default {
    
    @JSImport("antd/lib/transfer/ListBody", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    inline def getDerivedStateFromProps[T](param0: TransferListBodyProps[T], param1: TransferListBodyState): Current | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(param0.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[Current | Null]
  }
  
  @JSImport("antd/lib/transfer/ListBody", "OmitProps")
  @js.native
  val OmitProps: js.Tuple3["handleFilter", "handleClear", "checkedKeys"] = js.native
  
  @js.native
  trait ListBody[RecordType /* <: KeyWiseTransferItem */] extends Component[TransferListBodyProps[RecordType], TransferListBodyState, Any] {
    
    def getItems(): js.Array[RenderedItem[RecordType]] = js.native
    
    def onItemRemove(item: RecordType): Unit = js.native
    
    def onItemSelect(item: RecordType): Unit = js.native
    
    def onPageChange(current: Double): Unit = js.native
    
    @JSName("state")
    var state_ListBody: Current = js.native
  }
  
  type OmitProp = ElementOf[js.Tuple3["handleFilter", "handleClear", "checkedKeys"]]
  
  type PartialTransferListProps[RecordType] = Omit[TransferListProps[RecordType], OmitProp]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof antd.antd/lib/transfer/list.TransferListProps<RecordType>, antd.antd/lib/transfer/ListBody.OmitProp> ]: antd.antd/lib/transfer/list.TransferListProps<RecordType>[P]} */ trait TransferListBodyProps[RecordType] extends StObject {
    
    var filteredItems: js.Array[RecordType]
    
    var filteredRenderItems: js.Array[RenderedItem[RecordType]]
    
    var selectedKeys: js.Array[String]
  }
  object TransferListBodyProps {
    
    inline def apply[RecordType](
      filteredItems: js.Array[RecordType],
      filteredRenderItems: js.Array[RenderedItem[RecordType]],
      selectedKeys: js.Array[String]
    ): TransferListBodyProps[RecordType] = {
      val __obj = js.Dynamic.literal(filteredItems = filteredItems.asInstanceOf[js.Any], filteredRenderItems = filteredRenderItems.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyProps[RecordType]]
    }
    
    extension [Self <: TransferListBodyProps[?], RecordType](x: Self & TransferListBodyProps[RecordType]) {
      
      inline def setFilteredItems(value: js.Array[RecordType]): Self = StObject.set(x, "filteredItems", value.asInstanceOf[js.Any])
      
      inline def setFilteredItemsVarargs(value: RecordType*): Self = StObject.set(x, "filteredItems", js.Array(value*))
      
      inline def setFilteredRenderItems(value: js.Array[RenderedItem[RecordType]]): Self = StObject.set(x, "filteredRenderItems", value.asInstanceOf[js.Any])
      
      inline def setFilteredRenderItemsVarargs(value: RenderedItem[RecordType]*): Self = StObject.set(x, "filteredRenderItems", js.Array(value*))
      
      inline def setSelectedKeys(value: js.Array[String]): Self = StObject.set(x, "selectedKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedKeysVarargs(value: String*): Self = StObject.set(x, "selectedKeys", js.Array(value*))
    }
  }
  
  trait TransferListBodyState extends StObject {
    
    var current: Double
  }
  object TransferListBodyState {
    
    inline def apply(current: Double): TransferListBodyState = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransferListBodyState]
    }
    
    extension [Self <: TransferListBodyState](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    }
  }
}
