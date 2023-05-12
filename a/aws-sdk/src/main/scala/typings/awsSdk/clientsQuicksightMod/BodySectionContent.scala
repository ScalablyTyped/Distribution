package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodySectionContent extends StObject {
  
  /**
    * The layout configuration of a body section.
    */
  var Layout: js.UndefOr[SectionLayoutConfiguration] = js.undefined
}
object BodySectionContent {
  
  inline def apply(): BodySectionContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodySectionContent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BodySectionContent] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: SectionLayoutConfiguration): Self = StObject.set(x, "Layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "Layout", js.undefined)
  }
}
