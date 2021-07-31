package typings.antd.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSource extends StObject {
  
  var dataSource: js.Array[scala.Nothing]
  
  var showSearch: Boolean
  
  var titleText: String
}
object DataSource {
  
  @scala.inline
  def apply(dataSource: js.Array[scala.Nothing], showSearch: Boolean, titleText: String): DataSource = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], showSearch = showSearch.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSource]
  }
  
  @scala.inline
  implicit class DataSourceMutableBuilder[Self <: DataSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: js.Array[scala.Nothing]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataSourceVarargs(value: scala.Nothing*): Self = StObject.set(x, "dataSource", js.Array(value :_*))
    
    @scala.inline
    def setShowSearch(value: Boolean): Self = StObject.set(x, "showSearch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
  }
}
