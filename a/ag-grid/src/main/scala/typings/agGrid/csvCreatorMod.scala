package typings.agGrid

import typings.agGrid.columnControllerMod.ColumnController
import typings.agGrid.downloaderMod.Downloader
import typings.agGrid.exportParamsMod.CsvExportParams
import typings.agGrid.exportParamsMod.ExportParams
import typings.agGrid.exportParamsMod.ProcessCellForExportParams
import typings.agGrid.exportParamsMod.ProcessHeaderForExportParams
import typings.agGrid.gridOptionsWrapperMod.GridOptionsWrapper
import typings.agGrid.gridSerializerMod.BaseGridSerializingSession
import typings.agGrid.gridSerializerMod.GridSerializer
import typings.agGrid.gridSerializerMod.GridSerializingSession
import typings.agGrid.valueServiceMod.ValueService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csvCreatorMod {
  
  @JSImport("ag-grid/dist/lib/csvCreator", "BaseCreator")
  @js.native
  abstract class BaseCreator[T, S /* <: GridSerializingSession[T] */, P /* <: ExportParams[T] */] () extends StObject {
    
    var beans: js.Any = js.native
    
    def createSerializingSession(): S = js.native
    def createSerializingSession(params: P): S = js.native
    
    def export(): String = js.native
    def export(userParams: P): String = js.native
    
    def getData(params: P): String = js.native
    
    def getDefaultFileExtension(): String = js.native
    
    def getDefaultFileName(): String = js.native
    
    /* private */ def getMergedParamsAndData(userParams: js.Any): js.Any = js.native
    
    def getMimeType(): String = js.native
    
    def isExportSuppressed(): Boolean = js.native
    
    /* private */ def mergeDefaultParams(userParams: js.Any): js.Any = js.native
    
    /* protected */ def setBeans(beans: BaseCreatorBeans): Unit = js.native
  }
  
  @JSImport("ag-grid/dist/lib/csvCreator", "CsvCreator")
  @js.native
  class CsvCreator () extends BaseCreator[String, CsvSerializingSession, CsvExportParams] {
    
    var columnController: js.Any = js.native
    
    var downloader: js.Any = js.native
    
    def exportDataAsCsv(): String = js.native
    def exportDataAsCsv(params: CsvExportParams): String = js.native
    
    def getDataAsCsv(): String = js.native
    def getDataAsCsv(params: CsvExportParams): String = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    var gridSerializer: js.Any = js.native
    
    def postConstruct(): Unit = js.native
    
    var valueService: js.Any = js.native
  }
  
  @JSImport("ag-grid/dist/lib/csvCreator", "CsvSerializingSession")
  @js.native
  class CsvSerializingSession protected () extends BaseGridSerializingSession[String] {
    def this(
      columnController: ColumnController,
      valueService: ValueService,
      gridOptionsWrapper: GridOptionsWrapper,
      processCellCallback: js.Function1[/* params */ ProcessCellForExportParams, String],
      processHeaderCallback: js.Function1[/* params */ ProcessHeaderForExportParams, String],
      suppressQuotes: Boolean,
      columnSeparator: String
    ) = this()
    
    var columnSeparator: js.Any = js.native
    
    var lineOpened: js.Any = js.native
    
    /* private */ def onNewBodyRowColumn(column: js.Any, index: js.Any, node: js.Any): js.Any = js.native
    
    /* private */ def onNewHeaderGroupingRowColumn(header: js.Any, index: js.Any, span: js.Any): js.Any = js.native
    
    /* private */ def onNewHeaderRowColumn(column: js.Any, index: js.Any, node: js.Any): js.Any = js.native
    
    /* private */ def putInQuotes(value: js.Any, suppressQuotes: js.Any): js.Any = js.native
    
    var result: js.Any = js.native
    
    var suppressQuotes: js.Any = js.native
  }
  
  @js.native
  trait BaseCreatorBeans extends StObject {
    
    var downloader: Downloader = js.native
    
    var gridOptionsWrapper: GridOptionsWrapper = js.native
    
    var gridSerializer: GridSerializer = js.native
  }
  object BaseCreatorBeans {
    
    @scala.inline
    def apply(downloader: Downloader, gridOptionsWrapper: GridOptionsWrapper, gridSerializer: GridSerializer): BaseCreatorBeans = {
      val __obj = js.Dynamic.literal(downloader = downloader.asInstanceOf[js.Any], gridOptionsWrapper = gridOptionsWrapper.asInstanceOf[js.Any], gridSerializer = gridSerializer.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseCreatorBeans]
    }
    
    @scala.inline
    implicit class BaseCreatorBeansMutableBuilder[Self <: BaseCreatorBeans] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownloader(value: Downloader): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridOptionsWrapper(value: GridOptionsWrapper): Self = StObject.set(x, "gridOptionsWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridSerializer(value: GridSerializer): Self = StObject.set(x, "gridSerializer", value.asInstanceOf[js.Any])
    }
  }
}
