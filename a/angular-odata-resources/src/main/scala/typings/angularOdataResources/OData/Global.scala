package typings.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularOdataResources.anon.TypeofPredicate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends js.Object {
  
  var BinaryOperation: Instantiable3[
    /* propertyOrPredicate */ js.Any, 
    /* valueOrOperator */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    typings.angularOdataResources.OData.BinaryOperation
  ] = js.native
  
  var Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall] = js.native
  
  var OrderBy: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement] = js.native
  
  var Predicate: TypeofPredicate = js.native
  
  var Property: Instantiable1[/* value */ String, typings.angularOdataResources.OData.Property] = js.native
  
  var Provider: typings.angularOdataResources.OData.Provider[_] = js.native
  
  var Value: Instantiable2[
    /* value */ js.Any, 
    /* type */ js.UndefOr[String], 
    typings.angularOdataResources.OData.Value
  ] = js.native
}
object Global {
  
  @scala.inline
  def apply(
    BinaryOperation: Instantiable3[
      /* propertyOrPredicate */ js.Any, 
      /* valueOrOperator */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      BinaryOperation
    ],
    Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall],
    OrderBy: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement],
    Predicate: TypeofPredicate,
    Property: Instantiable1[/* value */ String, Property],
    Provider: Provider[_],
    Value: Instantiable2[/* value */ js.Any, /* type */ js.UndefOr[String], Value]
  ): Global = {
    val __obj = js.Dynamic.literal(BinaryOperation = BinaryOperation.asInstanceOf[js.Any], Func = Func.asInstanceOf[js.Any], OrderBy = OrderBy.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit class GlobalOps[Self <: Global] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBinaryOperation(
      value: Instantiable3[
          /* propertyOrPredicate */ js.Any, 
          /* valueOrOperator */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[js.Any], 
          BinaryOperation
        ]
    ): Self = this.set("BinaryOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall]): Self = this.set("Func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(
      value: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement]
    ): Self = this.set("OrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(value: TypeofPredicate): Self = this.set("Predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Instantiable1[/* value */ String, Property]): Self = this.set("Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: Provider[_]): Self = this.set("Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Instantiable2[/* value */ js.Any, /* type */ js.UndefOr[String], Value]): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
}
