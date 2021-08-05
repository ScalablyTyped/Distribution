package typings.antd.mod

import typings.antd.anon.DataSource
import typings.antd.anon.Placeholder
import typings.antd.anon.SourceSelectedKeys
import typings.antd.operationMod.TransferOperationProps
import typings.antd.transferListMod.TransferListProps
import typings.antd.transferMod.KeyWiseTransferItem
import typings.antd.transferMod.TransferItem
import typings.antd.transferMod.TransferProps
import typings.antd.transferMod.default
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd", "Transfer")
@js.native
class Transfer[RecordType /* <: TransferItem */] protected () extends default[RecordType] {
  def this(props: TransferProps[RecordType]) = this()
}
object Transfer {
  
  @JSImport("antd", "Transfer")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Transfer.List")
  @js.native
  class List[RecordType /* <: KeyWiseTransferItem */] protected ()
    extends typings.antd.transferListMod.default[RecordType] {
    def this(props: TransferListProps[/* import warning: RewrittenClass.unapply cls was tparam RecordType */ js.Any]) = this()
  }
  /* static member */
  /* was `typeof List` */
  object List {
    
    @JSImport("antd", "Transfer.List")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Transfer.List.defaultProps")
    @js.native
    def defaultProps: DataSource = js.native
    inline def defaultProps_=(x: DataSource): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  @JSImport("antd", "Transfer.Operation")
  @js.native
  def Operation: js.Function1[
    /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
    Element
  ] = js.native
  inline def Operation_=(
    x: js.Function1[
      /* hasDisabledMoveToLeftMoveToRightLeftArrowTextRightArrowTextLeftActiveRightActiveClassNameStyleDirectionOneWay */ TransferOperationProps, 
      Element
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Operation")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("antd", "Transfer.Search")
  @js.native
  class Search ()
    extends typings.antd.transferSearchMod.default
  /* static member */
  /* was `typeof Search` */
  object Search {
    
    @JSImport("antd", "Transfer.Search")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Transfer.Search.defaultProps")
    @js.native
    def defaultProps: Placeholder = js.native
    inline def defaultProps_=(x: Placeholder): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd", "Transfer.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd", "Transfer.defaultProps.dataSource")
    @js.native
    def dataSource: js.Array[scala.Nothing] = js.native
    inline def dataSource_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataSource")(x.asInstanceOf[js.Any])
    
    inline def listStyle(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listStyle")().asInstanceOf[Unit]
    
    @JSImport("antd", "Transfer.defaultProps.showSearch")
    @js.native
    def showSearch: Boolean = js.native
    inline def showSearch_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showSearch")(x.asInstanceOf[js.Any])
  }
  
  /* static member */
  inline def getDerivedStateFromProps[T](hasSelectedKeysTargetKeysPaginationChildren: TransferProps[T]): SourceSelectedKeys | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(hasSelectedKeysTargetKeysPaginationChildren.asInstanceOf[js.Any]).asInstanceOf[SourceSelectedKeys | Null]
}
