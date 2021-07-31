package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Views
@js.native
trait ArangoSearchView extends StObject {
  
  var _dbName: String = js.native
  
  var _id: String = js.native
  
  def name(): String = js.native
  
  def properties(): ArangoSearchViewProperties = js.native
  def properties(newProperties: ArangoSearchViewPropertiesOptions): ArangoSearchViewProperties = js.native
  
  def rename(newName: String): Unit = js.native
  
  def `type`(): ViewType = js.native
}
