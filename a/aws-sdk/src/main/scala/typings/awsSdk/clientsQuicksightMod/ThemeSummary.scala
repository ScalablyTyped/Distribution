package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThemeSummary extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsQuicksightMod.Arn] = js.undefined
  
  /**
    * The date and time that this theme was created.
    */
  var CreatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The last date and time that this theme was updated.
    */
  var LastUpdatedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest version number for the theme. 
    */
  var LatestVersionNumber: js.UndefOr[VersionNumber] = js.undefined
  
  /**
    * the display name for the theme.
    */
  var Name: js.UndefOr[ThemeName] = js.undefined
  
  /**
    * The ID of the theme. This ID is unique per Amazon Web Services Region for each Amazon Web Services account.
    */
  var ThemeId: js.UndefOr[RestrictiveResourceId] = js.undefined
}
object ThemeSummary {
  
  inline def apply(): ThemeSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeSummary]
  }
  
  extension [Self <: ThemeSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCreatedTime(value: js.Date): Self = StObject.set(x, "CreatedTime", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeUndefined: Self = StObject.set(x, "CreatedTime", js.undefined)
    
    inline def setLastUpdatedTime(value: js.Date): Self = StObject.set(x, "LastUpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeUndefined: Self = StObject.set(x, "LastUpdatedTime", js.undefined)
    
    inline def setLatestVersionNumber(value: VersionNumber): Self = StObject.set(x, "LatestVersionNumber", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionNumberUndefined: Self = StObject.set(x, "LatestVersionNumber", js.undefined)
    
    inline def setName(value: ThemeName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setThemeId(value: RestrictiveResourceId): Self = StObject.set(x, "ThemeId", value.asInstanceOf[js.Any])
    
    inline def setThemeIdUndefined: Self = StObject.set(x, "ThemeId", js.undefined)
  }
}
