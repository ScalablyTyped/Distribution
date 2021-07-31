package typings.algoliaClientSearch.mod

import typings.algoliaTransporter.mod.Transporter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchIndex extends StObject {
  
  /**
    * The application id.
    */
  val appId: String
  
  /**
    * The index name.
    */
  val indexName: String
  
  /**
    * The underlying transporter.
    */
  val transporter: Transporter
}
object SearchIndex {
  
  @scala.inline
  def apply(appId: String, indexName: String, transporter: Transporter): SearchIndex = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], indexName = indexName.asInstanceOf[js.Any], transporter = transporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchIndex]
  }
  
  @scala.inline
  implicit class SearchIndexMutableBuilder[Self <: SearchIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexName(value: String): Self = StObject.set(x, "indexName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransporter(value: Transporter): Self = StObject.set(x, "transporter", value.asInstanceOf[js.Any])
  }
}
