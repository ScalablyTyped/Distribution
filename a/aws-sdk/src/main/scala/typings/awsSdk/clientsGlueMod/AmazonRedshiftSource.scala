package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AmazonRedshiftSource extends StObject {
  
  /**
    * Specifies the data of the Amazon Reshift source node.
    */
  var Data: js.UndefOr[AmazonRedshiftNodeData] = js.undefined
  
  /**
    * The name of the Amazon Redshift source.
    */
  var Name: js.UndefOr[NodeName] = js.undefined
}
object AmazonRedshiftSource {
  
  inline def apply(): AmazonRedshiftSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmazonRedshiftSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AmazonRedshiftSource] (val x: Self) extends AnyVal {
    
    inline def setData(value: AmazonRedshiftNodeData): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
    
    inline def setName(value: NodeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
