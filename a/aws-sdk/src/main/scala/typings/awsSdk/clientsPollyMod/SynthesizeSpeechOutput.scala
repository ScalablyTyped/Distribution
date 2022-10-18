package typings.awsSdk.clientsPollyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SynthesizeSpeechOutput extends StObject {
  
  /**
    *  Stream containing the synthesized speech. 
    */
  var AudioStream: js.UndefOr[typings.awsSdk.clientsPollyMod.AudioStream] = js.undefined
  
  /**
    *  Specifies the type audio stream. This should reflect the OutputFormat parameter in your request.     If you request mp3 as the OutputFormat, the ContentType returned is audio/mpeg.     If you request ogg_vorbis as the OutputFormat, the ContentType returned is audio/ogg.     If you request pcm as the OutputFormat, the ContentType returned is audio/pcm in a signed 16-bit, 1 channel (mono), little-endian format.    If you request json as the OutputFormat, the ContentType returned is application/x-json-stream.    
    */
  var ContentType: js.UndefOr[typings.awsSdk.clientsPollyMod.ContentType] = js.undefined
  
  /**
    * Number of characters synthesized.
    */
  var RequestCharacters: js.UndefOr[typings.awsSdk.clientsPollyMod.RequestCharacters] = js.undefined
}
object SynthesizeSpeechOutput {
  
  inline def apply(): SynthesizeSpeechOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SynthesizeSpeechOutput]
  }
  
  extension [Self <: SynthesizeSpeechOutput](x: Self) {
    
    inline def setAudioStream(value: AudioStream): Self = StObject.set(x, "AudioStream", value.asInstanceOf[js.Any])
    
    inline def setAudioStreamUndefined: Self = StObject.set(x, "AudioStream", js.undefined)
    
    inline def setContentType(value: ContentType): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    inline def setRequestCharacters(value: RequestCharacters): Self = StObject.set(x, "RequestCharacters", value.asInstanceOf[js.Any])
    
    inline def setRequestCharactersUndefined: Self = StObject.set(x, "RequestCharacters", js.undefined)
  }
}
