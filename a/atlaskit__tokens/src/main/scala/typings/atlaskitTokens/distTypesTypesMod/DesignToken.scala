package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.DescriptionGroup
import typings.atlaskitTokens.anon.Introduced
import typings.atlaskitTokens.anon.State
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignToken[TValue, Group /* <: Groups */]
  extends StObject
     with Token[TValue, Group] {
  
  @JSName("attributes")
  var attributes_DesignToken: Introduced[Group] | typings.atlaskitTokens.anon.Replacement[Group] | State[Group] | DescriptionGroup[Group]
}
object DesignToken {
  
  inline def apply[TValue, Group /* <: Groups */](
    attributes: Introduced[Group] | typings.atlaskitTokens.anon.Replacement[Group] | State[Group] | DescriptionGroup[Group],
    value: TValue
  ): DesignToken[TValue, Group] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignToken[TValue, Group]]
  }
  
  extension [Self <: DesignToken[?, ?], TValue, Group /* <: Groups */](x: Self & (DesignToken[TValue, Group])) {
    
    inline def setAttributes(
      value: Introduced[Group] | typings.atlaskitTokens.anon.Replacement[Group] | State[Group] | DescriptionGroup[Group]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
