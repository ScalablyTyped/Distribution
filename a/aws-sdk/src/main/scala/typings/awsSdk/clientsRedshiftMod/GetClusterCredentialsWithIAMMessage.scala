package typings.awsSdk.clientsRedshiftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetClusterCredentialsWithIAMMessage extends StObject {
  
  /**
    * The unique identifier of the cluster that contains the database for which you are requesting credentials. 
    */
  var ClusterIdentifier: String
  
  /**
    * The name of the database for which you are requesting credentials. If the database name is specified, the IAM policy must allow access to the resource dbname for the specified database name. If the database name is not specified, access to all databases is allowed.
    */
  var DbName: js.UndefOr[String] = js.undefined
  
  /**
    * The number of seconds until the returned temporary password expires. Range: 900-3600. Default: 900.
    */
  var DurationSeconds: js.UndefOr[IntegerOptional] = js.undefined
}
object GetClusterCredentialsWithIAMMessage {
  
  inline def apply(ClusterIdentifier: String): GetClusterCredentialsWithIAMMessage = {
    val __obj = js.Dynamic.literal(ClusterIdentifier = ClusterIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetClusterCredentialsWithIAMMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetClusterCredentialsWithIAMMessage] (val x: Self) extends AnyVal {
    
    inline def setClusterIdentifier(value: String): Self = StObject.set(x, "ClusterIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDbName(value: String): Self = StObject.set(x, "DbName", value.asInstanceOf[js.Any])
    
    inline def setDbNameUndefined: Self = StObject.set(x, "DbName", js.undefined)
    
    inline def setDurationSeconds(value: IntegerOptional): Self = StObject.set(x, "DurationSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationSecondsUndefined: Self = StObject.set(x, "DurationSeconds", js.undefined)
  }
}
