package typings.atlassianCrowdClient

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianCrowdClient.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object attributesMod {
  
  @JSImport("atlassian-crowd-client/lib/models/attributes", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Attributes {
    def this(attributePairs: StringDictionary[js.Any]) = this()
  }
  @JSImport("atlassian-crowd-client/lib/models/attributes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @scala.inline
  def fromCrowd(attributesArr: js.Array[Name]): Attributes = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(attributesArr.asInstanceOf[js.Any]).asInstanceOf[Attributes]
  @scala.inline
  def fromCrowd(attributesArr: js.Array[Name], parse: js.Function1[/* json */ String, js.Any]): Attributes = (^.asInstanceOf[js.Dynamic].applyDynamic("fromCrowd")(attributesArr.asInstanceOf[js.Any], parse.asInstanceOf[js.Any])).asInstanceOf[Attributes]
  
  @js.native
  trait Attributes extends StObject {
    
    val attributes: StringDictionary[js.Any] = js.native
    
    def toCrowd(): js.Any = js.native
    def toCrowd(stringify: js.Function1[/* attr */ js.Any, String]): js.Any = js.native
  }
}
