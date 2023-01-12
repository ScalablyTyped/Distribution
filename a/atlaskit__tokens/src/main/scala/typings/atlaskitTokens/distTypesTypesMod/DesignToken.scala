package typings.atlaskitTokens.distTypesTypesMod

import typings.atlaskitTokens.anon.DeletedDeprecated
import typings.atlaskitTokens.anon.DeprecatedDescription
import typings.atlaskitTokens.anon.DescriptionGroup
import typings.atlaskitTokens.anon.Suggest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesignToken[TValue, Group /* <: Groups */]
  extends StObject
     with Token[TValue, Group] {
  
  @JSName("attributes")
  var attributes_DesignToken: Suggest[Group] | DeprecatedDescription[Group] | DeletedDeprecated[Group] | DescriptionGroup[Group]
}
object DesignToken {
  
  inline def apply[TValue, Group /* <: Groups */](
    attributes: Suggest[Group] | DeprecatedDescription[Group] | DeletedDeprecated[Group] | DescriptionGroup[Group],
    value: TValue
  ): DesignToken[TValue, Group] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesignToken[TValue, Group]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DesignToken[?, ?], TValue, Group /* <: Groups */] (val x: Self & (DesignToken[TValue, Group])) extends AnyVal {
    
    inline def setAttributes(
      value: Suggest[Group] | DeprecatedDescription[Group] | DeletedDeprecated[Group] | DescriptionGroup[Group]
    ): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
