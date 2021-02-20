package typings.atlassianConnectJs.anon

import org.scalablytyped.runtime.StringDictionary
import typings.atlassianConnectJs.atlassianConnectJsStrings.auto
import typings.atlassianConnectJs.atlassianConnectJsStrings.error
import typings.atlassianConnectJs.atlassianConnectJsStrings.info
import typings.atlassianConnectJs.atlassianConnectJsStrings.manual
import typings.atlassianConnectJs.atlassianConnectJsStrings.success
import typings.atlassianConnectJs.atlassianConnectJsStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  title :string,   body :string,   type :'info' | 'success' | 'warning' | 'error',   close :'manual' | 'auto',   actions :{[key: string] : string}}> */
@js.native
trait Partialtitlestringbodystr extends StObject {
  
  var actions: js.UndefOr[StringDictionary[String]] = js.native
  
  var body: js.UndefOr[String] = js.native
  
  var close: js.UndefOr[manual | auto] = js.native
  
  var title: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[info | success | warning | error] = js.native
}
object Partialtitlestringbodystr {
  
  @scala.inline
  def apply(): Partialtitlestringbodystr = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Partialtitlestringbodystr]
  }
  
  @scala.inline
  implicit class PartialtitlestringbodystrMutableBuilder[Self <: Partialtitlestringbodystr] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActions(value: StringDictionary[String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    @scala.inline
    def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setClose(value: manual | auto): Self = StObject.set(x, "close", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setType(value: info | success | warning | error): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
