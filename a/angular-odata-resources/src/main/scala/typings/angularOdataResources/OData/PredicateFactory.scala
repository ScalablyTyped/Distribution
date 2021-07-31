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
     with Instantiable1[/* propertyOrValueOrPredicate */ js.Any, Predicate]
     with Instantiable2[/* propertyOrValueOrPredicate */ js.Any, /* valueOrOperator */ js.Any, Predicate]
     with Instantiable3[
      /* propertyOrValueOrPredicate */ js.Any, 
      (/* valueOrOperator */ js.Any) | (/* valueOrOperator */ Unit), 
      /* value */ js.Any, 
      Predicate
    ] {
  
  def and(andStatements: js.Any): IExecutable = js.native
  
  def create(propertyOrPredicate: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: js.Any, value: js.Any): IExecutable = js.native
  def create(propertyOrPredicate: js.Any, operatorOrValue: Unit, value: js.Any): IExecutable = js.native
  
  def or(orStatements: js.Array[js.Any]): IExecutable = js.native
}
