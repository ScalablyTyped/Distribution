package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeAlias extends StObject {
  
  /**
    * The display name of the theme alias.
    */
  var AliasName: js.UndefOr[typings.awsSdk.clientsQuicksightMod.AliasName] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the theme alias.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The version number of the theme alias.
    */
  var ThemeVersionNumber: js.UndefOr[VersionNumber] = js.undefined
}
object ThemeAlias {
  
  inline def apply(): ThemeAlias = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeAlias]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeAlias] (val x: Self) extends AnyVal {
    
    inline def setAliasName(value: AliasName): Self = StObject.set(x, "AliasName", value.asInstanceOf[js.Any])
    
    inline def setAliasNameUndefined: Self = StObject.set(x, "AliasName", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setThemeVersionNumber(value: VersionNumber): Self = StObject.set(x, "ThemeVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setThemeVersionNumberUndefined: Self = StObject.set(x, "ThemeVersionNumber", js.undefined)
  }
}
