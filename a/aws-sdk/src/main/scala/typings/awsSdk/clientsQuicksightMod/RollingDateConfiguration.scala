package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollingDateConfiguration extends StObject {
  
  /**
    * The data set that is used in the rolling date configuration.
    */
  var DataSetIdentifier: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DataSetIdentifier] = js.undefined
  
  /**
    * The expression of the rolling date configuration.
    */
  var Expression: typings.awsSdk.clientsQuicksightMod.Expression
}
object RollingDateConfiguration {
  
  inline def apply(Expression: Expression): RollingDateConfiguration = {
    val __obj = js.Dynamic.literal(Expression = Expression.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollingDateConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RollingDateConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDataSetIdentifier(value: DataSetIdentifier): Self = StObject.set(x, "DataSetIdentifier", value.asInstanceOf[js.Any])
    
    inline def setDataSetIdentifierUndefined: Self = StObject.set(x, "DataSetIdentifier", js.undefined)
    
    inline def setExpression(value: Expression): Self = StObject.set(x, "Expression", value.asInstanceOf[js.Any])
  }
}
