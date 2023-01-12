package typings.awsSdk.clientsMachinelearningMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RedshiftDatabase extends StObject {
  
  var ClusterIdentifier: RedshiftClusterIdentifier
  
  var DatabaseName: RedshiftDatabaseName
}
object RedshiftDatabase {
  
  inline def apply(ClusterIdentifier: RedshiftClusterIdentifier, DatabaseName: RedshiftDatabaseName): RedshiftDatabase = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any], DatabaseName = DatabaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[RedshiftDatabase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RedshiftDatabase] (val x: Self) extends AnyVal {
    
    inline def setClusterIdentifier(value: RedshiftClusterIdentifier): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDatabaseName(value: RedshiftDatabaseName): Self = StObject.set(x, "DatabaseName", value.asInstanceOf[js.Any])
  }
}
