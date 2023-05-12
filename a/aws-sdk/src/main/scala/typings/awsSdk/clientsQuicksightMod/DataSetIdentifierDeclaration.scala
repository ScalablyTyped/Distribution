package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSetIdentifierDeclaration extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the data set.
    */
  var DataSetArn: Arn
  
  /**
    * The identifier of the data set, typically the data set's name.
    */
  var Identifier: DataSetIdentifier
}
object DataSetIdentifierDeclaration {
  
  inline def apply(DataSetArn: Arn, Identifier: DataSetIdentifier): DataSetIdentifierDeclaration = {
    val __obj = js.Dynamic.literal(DataSetArn = DataSetArn.asInstanceOf[js.Any], Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataSetIdentifierDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSetIdentifierDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDataSetArn(value: Arn): Self = StObject.set(x, "DataSetArn", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
