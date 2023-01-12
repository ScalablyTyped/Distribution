package typings.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.angularOdataResources.anon.TypeofPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Global extends StObject {
  
  var BinaryOperation: Instantiable3[
    /* propertyOrPredicate */ Any, 
    /* valueOrOperator */ js.UndefOr[Any], 
    /* value */ js.UndefOr[Any], 
    typings.angularOdataResources.OData.BinaryOperation
  ]
  
  var Func: Instantiable2[/* methodName */ String, /* args (repeated) */ Any, MethodCall]
  
  var OrderBy: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement]
  
  var Predicate: TypeofPredicate & (Instantiable3[
    /* propertyOrValueOrPredicate */ Any, 
    /* valueOrOperator */ js.UndefOr[Any], 
    /* value */ js.UndefOr[Any], 
    typings.angularOdataResources.OData.Predicate
  ])
  
  var Property: Instantiable1[/* value */ String, typings.angularOdataResources.OData.Property]
  
  var Provider: typings.angularOdataResources.OData.Provider[Any]
  
  var Value: Instantiable2[
    /* value */ Any, 
    /* type */ js.UndefOr[String], 
    typings.angularOdataResources.OData.Value
  ]
}
object Global {
  
  inline def apply(
    BinaryOperation: Instantiable3[
      /* propertyOrPredicate */ Any, 
      /* valueOrOperator */ js.UndefOr[Any], 
      /* value */ js.UndefOr[Any], 
      BinaryOperation
    ],
    Func: Instantiable2[/* methodName */ String, /* args (repeated) */ Any, MethodCall],
    OrderBy: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement],
    Predicate: TypeofPredicate & (Instantiable3[
      /* propertyOrValueOrPredicate */ Any, 
      /* valueOrOperator */ js.UndefOr[Any], 
      /* value */ js.UndefOr[Any], 
      Predicate
    ]),
    Property: Instantiable1[/* value */ String, Property],
    Provider: Provider[Any],
    Value: Instantiable2[/* value */ Any, /* type */ js.UndefOr[String], Value]
  ): Global = {
    val __obj = js.Dynamic.literal(BinaryOperation = BinaryOperation.asInstanceOf[js.Any], Func = Func.asInstanceOf[js.Any], OrderBy = OrderBy.asInstanceOf[js.Any], Predicate = Predicate.asInstanceOf[js.Any], Property = Property.asInstanceOf[js.Any], Provider = Provider.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Global]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Global] (val x: Self) extends AnyVal {
    
    inline def setBinaryOperation(
      value: Instantiable3[
          /* propertyOrPredicate */ Any, 
          /* valueOrOperator */ js.UndefOr[Any], 
          /* value */ js.UndefOr[Any], 
          BinaryOperation
        ]
    ): Self = StObject.set(x, "BinaryOperation", value.asInstanceOf[js.Any])
    
    inline def setFunc(value: Instantiable2[/* methodName */ String, /* args (repeated) */ Any, MethodCall]): Self = StObject.set(x, "Func", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(
      value: Instantiable2[/* propertyName */ String, /* sortOrder */ js.UndefOr[String], OrderByStatement]
    ): Self = StObject.set(x, "OrderBy", value.asInstanceOf[js.Any])
    
    inline def setPredicate(
      value: TypeofPredicate & (Instantiable3[
          /* propertyOrValueOrPredicate */ Any, 
          /* valueOrOperator */ js.UndefOr[Any], 
          /* value */ js.UndefOr[Any], 
          Predicate
        ])
    ): Self = StObject.set(x, "Predicate", value.asInstanceOf[js.Any])
    
    inline def setProperty(value: Instantiable1[/* value */ String, Property]): Self = StObject.set(x, "Property", value.asInstanceOf[js.Any])
    
    inline def setProvider(value: Provider[Any]): Self = StObject.set(x, "Provider", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Instantiable2[/* value */ Any, /* type */ js.UndefOr[String], Value]): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
