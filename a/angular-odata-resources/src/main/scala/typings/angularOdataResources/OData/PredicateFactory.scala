package typings.angularOdataResources.OData

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PredicateFactory
  extends StObject
     with Instantiable1[/* propertyOrValueOrPredicate */ Any, Predicate]
     with Instantiable2[/* propertyOrValueOrPredicate */ Any, /* valueOrOperator */ Any, Predicate]
     with Instantiable3[
      /* propertyOrValueOrPredicate */ Any, 
      (/* valueOrOperator */ Any) | (/* valueOrOperator */ Unit), 
      /* value */ Any, 
      Predicate
    ] {
  
  def and(andStatements: Any): IExecutable = js.native
  
  def create(propertyOrPredicate: Any): IExecutable = js.native
  def create(propertyOrPredicate: Any, operatorOrValue: Any): IExecutable = js.native
  def create(propertyOrPredicate: Any, operatorOrValue: Any, value: Any): IExecutable = js.native
  def create(propertyOrPredicate: Any, operatorOrValue: Unit, value: Any): IExecutable = js.native
  
  def or(orStatements: js.Array[Any]): IExecutable = js.native
}
