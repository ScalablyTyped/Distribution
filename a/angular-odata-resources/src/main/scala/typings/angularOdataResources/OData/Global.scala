package typings.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularOdataResources.anon.TypeofPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Global extends StObject {
  
  var BinaryOperation: Instantiable3[
    /* propertyOrPredicate */ js.Any, 
    /* valueOrOperator */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    typings.angularOdataResources.OData.BinaryOperation
  ] = js.native
  
  var Func: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall] = js.native
  
  var OrderBy: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement] = js.native
  
  var Predicate: TypeofPredicate with (Instantiable3[
    /* propertyOrValueOrPredicate */ js.Any, 
    /* valueOrOperator */ js.UndefOr[js.Any], 
    /* value */ js.UndefOr[js.Any], 
    typings.angularOdataResources.OData.Predicate
  ]) = js.native
  
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
    Predicate: TypeofPredicate with (Instantiable3[
      /* propertyOrValueOrPredicate */ js.Any, 
      /* valueOrOperator */ js.UndefOr[js.Any], 
      /* value */ js.UndefOr[js.Any], 
      Predicate
    ]),
    Property: Instantiable1[/* value */ String, Property],
    Provider: Provider[_],
    Value: Instantiable2[/* value */ js.Any, /* type */ js.UndefOr[String], Value]
  ): Global = {
    val __obj = js.Dynamic.literal(BinaryOperation = BinaryOperation.asInstanceOf[js.Any], Func = Func.asInstanceOf[js.Any], OrderBy = OrderBy.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit class GlobalMutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryOperation(
      value: Instantiable3[
          /* propertyOrPredicate */ js.Any, 
          /* valueOrOperator */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[js.Any], 
          BinaryOperation
        ]
    ): Self = StObject.set(x, "BinaryOperation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunc(value: Instantiable2[/* methodName */ String, /* args (repeated) */ js.Any, MethodCall]): Self = StObject.set(x, "Func", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderBy(
      value: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement]
    ): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPredicate(
      value: TypeofPredicate with (Instantiable3[
          /* propertyOrValueOrPredicate */ js.Any, 
          /* valueOrOperator */ js.UndefOr[js.Any], 
          /* value */ js.UndefOr[js.Any], 
          Predicate
        ])
    ): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperty(value: Instantiable1[/* value */ String, Property]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvider(value: Provider[_]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Instantiable2[/* value */ js.Any, /* type */ js.UndefOr[String], Value]): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
