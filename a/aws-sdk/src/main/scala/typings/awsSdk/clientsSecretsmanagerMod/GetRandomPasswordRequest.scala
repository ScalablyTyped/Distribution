package typings.awsSdk.clientsSecretsmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRandomPasswordRequest extends StObject {
  
  /**
    * A string of the characters that you don't want in the password.
    */
  var ExcludeCharacters: js.UndefOr[ExcludeCharactersType] = js.undefined
  
  /**
    * Specifies whether to exclude lowercase letters from the password. If you don't include this switch, the password can contain lowercase letters.
    */
  var ExcludeLowercase: js.UndefOr[ExcludeLowercaseType] = js.undefined
  
  /**
    * Specifies whether to exclude numbers from the password. If you don't include this switch, the password can contain numbers.
    */
  var ExcludeNumbers: js.UndefOr[ExcludeNumbersType] = js.undefined
  
  /**
    * Specifies whether to exclude the following punctuation characters from the password: ! " # $ % &amp; ' ( ) * + , - . / : ; &lt; = &gt; ? @ [ \ ] ^ _ ` { | } ~. If you don't include this switch, the password can contain punctuation.
    */
  var ExcludePunctuation: js.UndefOr[ExcludePunctuationType] = js.undefined
  
  /**
    * Specifies whether to exclude uppercase letters from the password. If you don't include this switch, the password can contain uppercase letters.
    */
  var ExcludeUppercase: js.UndefOr[ExcludeUppercaseType] = js.undefined
  
  /**
    * Specifies whether to include the space character. If you include this switch, the password can contain space characters.
    */
  var IncludeSpace: js.UndefOr[IncludeSpaceType] = js.undefined
  
  /**
    * The length of the password. If you don't include this parameter, the default length is 32 characters.
    */
  var PasswordLength: js.UndefOr[PasswordLengthType] = js.undefined
  
  /**
    * Specifies whether to include at least one upper and lowercase letter, one number, and one punctuation. If you don't include this switch, the password contains at least one of every character type.
    */
  var RequireEachIncludedType: js.UndefOr[RequireEachIncludedTypeType] = js.undefined
}
object GetRandomPasswordRequest {
  
  inline def apply(): GetRandomPasswordRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRandomPasswordRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetRandomPasswordRequest] (val x: Self) extends AnyVal {
    
    inline def setExcludeCharacters(value: ExcludeCharactersType): Self = StObject.set(x, "ExcludeCharacters", value.asInstanceOf[js.Any])
    
    inline def setExcludeCharactersUndefined: Self = StObject.set(x, "ExcludeCharacters", js.undefined)
    
    inline def setExcludeLowercase(value: ExcludeLowercaseType): Self = StObject.set(x, "ExcludeLowercase", value.asInstanceOf[js.Any])
    
    inline def setExcludeLowercaseUndefined: Self = StObject.set(x, "ExcludeLowercase", js.undefined)
    
    inline def setExcludeNumbers(value: ExcludeNumbersType): Self = StObject.set(x, "ExcludeNumbers", value.asInstanceOf[js.Any])
    
    inline def setExcludeNumbersUndefined: Self = StObject.set(x, "ExcludeNumbers", js.undefined)
    
    inline def setExcludePunctuation(value: ExcludePunctuationType): Self = StObject.set(x, "ExcludePunctuation", value.asInstanceOf[js.Any])
    
    inline def setExcludePunctuationUndefined: Self = StObject.set(x, "ExcludePunctuation", js.undefined)
    
    inline def setExcludeUppercase(value: ExcludeUppercaseType): Self = StObject.set(x, "ExcludeUppercase", value.asInstanceOf[js.Any])
    
    inline def setExcludeUppercaseUndefined: Self = StObject.set(x, "ExcludeUppercase", js.undefined)
    
    inline def setIncludeSpace(value: IncludeSpaceType): Self = StObject.set(x, "IncludeSpace", value.asInstanceOf[js.Any])
    
    inline def setIncludeSpaceUndefined: Self = StObject.set(x, "IncludeSpace", js.undefined)
    
    inline def setPasswordLength(value: PasswordLengthType): Self = StObject.set(x, "PasswordLength", value.asInstanceOf[js.Any])
    
    inline def setPasswordLengthUndefined: Self = StObject.set(x, "PasswordLength", js.undefined)
    
    inline def setRequireEachIncludedType(value: RequireEachIncludedTypeType): Self = StObject.set(x, "RequireEachIncludedType", value.asInstanceOf[js.Any])
    
    inline def setRequireEachIncludedTypeUndefined: Self = StObject.set(x, "RequireEachIncludedType", js.undefined)
  }
}
